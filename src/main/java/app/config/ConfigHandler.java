package app.config;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ConfigHandler {
    private static Config config;
    private static Gson gson = new Gson();

    public static void loadConfig() {
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

    public static Config getConfig() {
        return config;
    }
}
