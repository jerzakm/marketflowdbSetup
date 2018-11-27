package app.schemaBuilders;

import app.DbHandler;
import app.config.DbStructure;

import java.util.Arrays;

public class SpecialBuilder {
    public static void build(){
        makePostageTable();
        makeItemOptionsTable();
        makeItemAttribsTable();
        makeItemDescTable();
    }

    private static void makePostageTable() {
        System.out.println("MAKING SPECIAL TABLE -- POSTAGE TABLE");

        String statement =
                "CREATE TABLE itpostage (\n" +
                        "offer_id                       INT        NOT NULL,\n" +
                        "postage_id                     INT        NOT NULL,\n" +
                        "start_time                     BIGINT     NOT NULL,\n" +
                        "end_time                       BIGINT             ,\n" +
                        "postageAmount                  MONEY      NOT NULL,\n" +
                        "postageAmountAdd               MONEY      NOT NULL,\n" +
                        "postagePackSize                INT        NOT NULL,\n" +
                        "postageFreeShipping            INT        NOT NULL,\n" +
                        "postageFulfillmentTime_from    BIGINT     NOT NULL,\n" +
                        "postageFulfillmentTime_to      BIGINT     NOT NULL,\n" +
                        "PRIMARY KEY(offer_id, postage_id, start_time))";
        DbHandler.executeStatement(statement);
    }

    private static void makeItemOptionsTable() {
        System.out.println("MAKING SPECIAL TABLE -- ITEM OPTIONS TABLE");

        String statement =
                "CREATE TABLE itoptions (\n" +
                        "offer_id                       INT        NOT NULL,\n" +
                        "option_id                      INT        NOT NULL,\n" +
                        "start_time                     BIGINT     NOT NULL,\n" +
                        "end_time                       BIGINT             ,\n" +
                        "PRIMARY KEY(offer_id, option_id, start_time))";
        DbHandler.executeStatement(statement);
    }

    private static void makeItemAttribsTable() {
        System.out.println("MAKING SPECIAL TABLE -- ITEM ATTRIBUTES TABLE");

        String statement =
                "CREATE TABLE itattribs (\n" +
                        "offer_id                       INT        NOT NULL,\n" +
                        "attr_name                      TEXT        NOT NULL,\n" +
                        "attr_value                     TEXT        NOT NULL,\n" +
                        "start_time                     BIGINT     NOT NULL,\n" +
                        "end_time                       BIGINT             ,\n" +
                        "PRIMARY KEY(offer_id, attr_name, start_time))";
        DbHandler.executeStatement(statement);
    }

    private static void makeItemDescTable() {
        System.out.println("MAKING SPECIAL TABLE -- DESCRIPTION TABLE");

        String statement =
                "CREATE TABLE itdesc (\n" +
                        "offer_id                       INT        NOT NULL,\n" +
                        "desc_hash                      TEXT        NOT NULL,\n" +
                        "desc_layout                    TEXT        NOT NULL,\n" +
                        "desc_s3loc                     TEXT        NOT NULL,\n" +
                        "start_time                     BIGINT     NOT NULL,\n" +
                        "end_time                       BIGINT             ,\n" +
                        "PRIMARY KEY(offer_id, desc_hash, start_time))";
        DbHandler.executeStatement(statement);
    }
}
