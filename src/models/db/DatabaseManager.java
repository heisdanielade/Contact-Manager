package models.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:contact.models.db";

    public static void connect() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("(i) Connected to the database.");
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(Queries.createTable());
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
