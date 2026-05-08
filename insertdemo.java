import java.sql.*;

public class insertdemo {
    static final String DB_URL = "jdbc:mysql://localhost/sakila";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // No actor_id needed — it is AUTO INCREMENT
            stmt.executeUpdate(
                "INSERT INTO actor(first_name, last_name) VALUES('Prathamesh','Galande')"
            );

            System.out.println("Data inserted successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}