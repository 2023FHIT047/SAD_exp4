import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String username = "admin";

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        Statement stmt = con.createStatement();

        String query = "SELECT * FROM users WHERE username = '" 
                     + username + "'";

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}
