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
        makeRangeInTimeMoney();
        makeRangeInTimeInt();
        makeRangeInTimeBigInt();
        makeRangeInTimeString();
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
        System.out.println("MAKING POINT IN TIME STRING DB - "+DbStructure.pointInTimeString.length + " tables defined");
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

    private static void makeRangeInTimeMoney() {
        System.out.println("MAKING RANGE IN TIME MONEY DB - "+DbStructure.rangeInTimeMoney.length + " tables defined");
        Arrays.stream(DbStructure.rangeInTimeMoney)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                            "offer_id       INT        NOT NULL,\n" +
                            "value          MONEY        NOT NULL,\n" +
                            "start_time          BIGINT     NOT NULL,\n" +
                            "end_time          BIGINT,\n" +
                            "PRIMARY KEY(offer_id, start_time))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makeRangeInTimeInt() {
        System.out.println("MAKING RANGE IN TIME INT DB - "+DbStructure.rangeInTimeInt.length + " tables defined");
        Arrays.stream(DbStructure.rangeInTimeInt)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                                    "offer_id       INT        NOT NULL,\n" +
                                    "value          INT        NOT NULL,\n" +
                                    "start_time          BIGINT     NOT NULL,\n" +
                                    "end_time          BIGINT,\n" +
                                    "PRIMARY KEY(offer_id, start_time))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makeRangeInTimeBigInt() {
        System.out.println("MAKING RANGE IN TIME BIGINT DB - "+DbStructure.rangeInTimeBigInt.length + " tables defined");
        Arrays.stream(DbStructure.rangeInTimeBigInt)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                                    "offer_id       INT        NOT NULL,\n" +
                                    "value          BIGINT        NOT NULL,\n" +
                                    "start_time          BIGINT     NOT NULL,\n" +
                                    "end_time          BIGINT,\n" +
                                    "PRIMARY KEY(offer_id, start_time))";
                    DbHandler.executeStatement(statement);
                });
    }

    private static void makeRangeInTimeString() {
        System.out.println("MAKING RANGE IN TIME STRING DB - "+DbStructure.rangeInTimeString.length + " tables defined");
        Arrays.stream(DbStructure.rangeInTimeString)
                .forEach(tableName -> {
                    System.out.println("----- current table: "+tableName);
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                                    "offer_id       INT        NOT NULL,\n" +
                                    "value          TEXT        NOT NULL,\n" +
                                    "start_time          BIGINT     NOT NULL,\n" +
                                    "end_time          BIGINT,\n" +
                                    "PRIMARY KEY(offer_id, start_time))";
                    DbHandler.executeStatement(statement);
                });
    }

}