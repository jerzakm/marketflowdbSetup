package app;

import app.config.Config;
import app.config.ConfigHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHandler {
    private static Connection con;
    private static Config config;

    public static void initDb() {
        config = ConfigHandler.getConfig();
        connectDb();
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

    public static void executeStatement(String sql) {
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");

            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
    }

    public static Connection getCon() {
        return con;
    }
}
