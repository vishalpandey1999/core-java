package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class testDataBaseConnection {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "123456");
            Statement stmt = con.createStatement();
            System.out.println("database connecting successfully........... now you can access and store the value from the database");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
