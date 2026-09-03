import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String username = "admin";
        String password = "1234";

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "root"
        );

        Statement stmt = con.createStatement();

        // Vulnerable: user input is directly concatenated into SQL
        String query = "SELECT * FROM users WHERE username='"
                     + username + "' AND password='" + password + "'";

        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
            System.out.println("Login successful");
        }
    }
}
