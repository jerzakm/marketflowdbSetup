package app;

import app.config.ConfigHandler;
import app.schemaBuilders.SpecialBuilder;
import app.schemaBuilders.StandardBuilder;
import com.google.gson.Gson;

public class Application {

    public static void main(String[] args) {
        ConfigHandler.loadConfig();
        System.out.println(new Gson().toJson(ConfigHandler.getConfig()));
        DbHandler.initDb();
        //StandardBuilder.build();
        SpecialBuilder.build();
    }
}