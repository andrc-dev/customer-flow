package com.demoapps.customerflow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTestConnection {
    // Postgres configs
    private static final String pgUrl = "jdbc:postgresql://localhost:5432/appdb";
    private static final String pgUsername = "postgres";
    private static final String pgPassword = "postgres";

    // MySQL configs
    private static final String mysqlUrl = "jdbc:mysql://localhost:3306/app_db?useSSL=false&serverTimezone=UTC";
    private static final String mysqlUsername = "root";
    private static final String mysqlPassword = "root";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(pgUrl, pgUsername, pgPassword)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}