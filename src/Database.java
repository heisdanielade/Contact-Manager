import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String URL = "jdbc:sqlite:friends.db";


    private static String createTable(){
        return "CREATE TABLE IF NOT EXISTS people (" +
                "id SMALLINT(3) PRIMARY KEY AUTOINCREMENT," +
                "first_name NOT NULL," +
                "last_name NOT NULL," +
                "age SMALLINT(3)," +
                "gender DEFAULT 'not-specified'" +
                ");";
    }


    public static void connect() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("(i) Connected to the database.");
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(createTable());
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
