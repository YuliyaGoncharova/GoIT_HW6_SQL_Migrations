package org.example;

import org.flywaydb.core.Flyway;
public class DatabaseInitService {
    public static void main(String[] args) {

        final String JDBC_CONNECTION_URL = "jdbc:h2:./db_hw6";
        final String JDBC_USER_NAME = "";
        final String JDBC_USER_PASSWORD = "";

        Flyway flyway = Flyway
                .configure()
                .dataSource(JDBC_CONNECTION_URL,
                        JDBC_USER_NAME,
                        JDBC_USER_PASSWORD)
                .load();

        flyway.migrate();
    }

}