package app.schemaBuilders;

import app.config.DbStructure;

import java.sql.Connection;
import java.util.Arrays;

public class StandardBuilder {
    private static Connection con;
    public static void build(Connection c) {
        con = c;
        makePointInTimeMoney();
        makePointInTimeInt();
    }

    private static void makePointInTimeMoney() {
        System.out.println("MAKING POINT IN TIME MONEY DB - "+DbStructure.pointInTimeMoney.length + " tables defined");
    }

    private static void makePointInTimeInt() {
        System.out.println("MAKING POINT IN TIME INT DB - "+DbStructure.pointInTimeInt.length + " tables defined");
        Arrays.stream(DbStructure.pointInTimeInt)
                .forEach(tableName -> {
                    String statement =
                            "CREATE TABLE "+tableName.toUpperCase()+"(\n" +
                            "   ID INT PRIMARY KEY     NOT NULL,\n" +
                            "   NAME           TEXT    NOT NULL,\n" +
                            "   AGE            INT     NOT NULL,\n" +
                            "   ADDRESS        CHAR(50),\n" +
                            "   SALARY         REAL\n" +
                            ");";

                });

    }
}
