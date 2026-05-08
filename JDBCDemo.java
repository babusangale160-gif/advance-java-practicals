import java.sql.*;

public class JDBCDemo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Registered!");

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Established!");

            Statement stmt = conn.createStatement();

            // Insert
            stmt.executeUpdate("INSERT INTO actor(first_name, last_name) VALUES('Prathamesh','Galande')");
            System.out.println("Data Inserted!");

            // Retrieve
            ResultSet rs = stmt.executeQuery("SELECT actor_id, first_name, last_name FROM actor");
            System.out.println("\n--- Actor List ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("actor_id") + " " +
                    rs.getString("first_name") + " " +
                    rs.getString("last_name")
                );
            }
            conn.close();
            System.out.println("\nConnection Closed!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}








step for compile code 
    1st new -javaproject-expno8-fhinsh
    2nd-src-new -class-name JDBCDemo add psv main  finish
    3rd -code paste 
    4th-right click on expno 8  -properties-built in path add external jar file sinish and close
    5th -run as a java application
    step



