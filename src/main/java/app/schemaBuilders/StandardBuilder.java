package app.schemaBuilders;

import app.DbHandler;
import app.config.DbStructure;

import java.sql.Connection;
import java.util.Arrays;

public class StandardBuilder {
    private static Connection con;
    public static void build() {
        makePointInTimeMoney();
        makePointInTimeInt();
        makePointInTimeBigInt();
        makePointInTimeString();
    }

    private static void makePointInTimeMoney() {
        System.out.println("MAKING POINT IN TIME MONEY DB - "+DbStructure.pointInTimeMoney.length + " tables defined");
        Arrays.stream(DbStructure.pointInTimeMoney)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                                    "offer_id       INT        NOT NULL,\n" +
                                    "value          MONEY        NOT NULL,\n" +
                                    "timestamp          BIGINT     NOT NULL,\n" +
                                    "PRIMARY KEY(offer_id, timestamp))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makePointInTimeInt() {
        System.out.println("MAKING POINT IN TIME INT DB - "+DbStructure.pointInTimeInt.length + " tables defined");
        Arrays.stream(DbStructure.pointInTimeInt)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                            "offer_id       INT        NOT NULL,\n" +
                            "value          INT        NOT NULL,\n" +
                            "timestamp          BIGINT     NOT NULL,\n" +
                            "PRIMARY KEY(offer_id, timestamp))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makePointInTimeBigInt() {
        System.out.println("MAKING POINT IN TIME BIGINT DB - "+DbStructure.pointInTimeBigInt.length + " tables defined");
        Arrays.stream(DbStructure.pointInTimeBigInt)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                            "offer_id       INT        NOT NULL,\n" +
                            "value          BIGINT        NOT NULL,\n" +
                            "timestamp          BIGINT     NOT NULL,\n" +
                            "PRIMARY KEY(offer_id, timestamp))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makePointInTimeString() {
        System.out.println("MAKING POINT IN TIME BIGINT DB - "+DbStructure.pointInTimeString.length + " tables defined");
        Arrays.stream(DbStructure.pointInTimeString)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                                    "offer_id       INT        NOT NULL,\n" +
                                    "value          TEXT        NOT NULL,\n" +
                                    "timestamp          BIGINT     NOT NULL,\n" +
                                    "PRIMARY KEY(offer_id, timestamp))";
                    DbHandler.executeStatement(statement);
                });
    }

}
