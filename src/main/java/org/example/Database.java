package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    private static final String JDBC_CONNECTION_URL = "jdbc:h2:./db_hw6";
    private static final String JDBC_USER_NAME = "";
    private static final String JDBC_USER_PASSWORD = "";
    private static Database instance;
    private Connection connection;


    private Database() {
        try {
            connection = DriverManager.getConnection(JDBC_CONNECTION_URL, JDBC_USER_NAME, JDBC_USER_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }


    public Connection getConnection() {
        return connection;
    }

}