package dbConnection;

import javax.swing.*;
import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) {



            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Vishal@1999");
                Statement stmt = con.createStatement();
                System.out.println("database connection succssfully...........");
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }

}
