package models.db;

public class Queries {

    protected static String createTable() {
        return "CREATE TABLE IF NOT EXISTS contact (" +
                "id SMALLINT(3) PRIMARY KEY AUTOINCREMENT," +
                "first_name NOT NULL," +
                "last_name NOT NULL," +
                "age SMALLINT(3)," +
                "gender DEFAULT 'not-specified'" +
                ");";
    }
}
