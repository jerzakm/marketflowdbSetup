package app;

import app.config.Config;
import app.schemaBuilders.StandardBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSetup {
    private static Config config;
    private static Connection con;

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        loadConfig();
        connectDb();
        StandardBuilder.build(con);
    }

    private static void loadConfig() {
        try {
            config = gson.fromJson(
                    FileUtils.readFileToString(new File("config.json")),
                    Config.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeDefaultCfgFile() {
        config = new Config();
        config.setDbUrl("jdbc:postgresql://URL:PORT/DATABASE_NAME");
        config.setPwd("pass");
        config.setUser("name");

        try {
            FileUtils.writeStringToFile(new File("config.json"),gson.toJson(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void connectDb() {
        con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection(config.getDbUrl(),
                            config.getUser(), config.getPwd());

            System.out.println("Opened database successfully");


        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
    }

    private static void closeDb() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}