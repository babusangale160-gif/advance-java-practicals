import java.sql.*;

public class Myclass {
    static final String DB_URL = "jdbc:mysql://localhost/sakila";
    static final String USER = "root";
    static final String PASS = "root";
    static final String selectquery = "SELECT actor_id, first_name, last_name FROM actor";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectquery);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("actor_id") + " " +
                    rs.getString("first_name") + " " +
                    rs.getString("last_name")
                );
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}