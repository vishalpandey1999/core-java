package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Accounts_In_JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String name = "root";
        String password = "123456";
        String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully......");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Connected successfully......");

            con.setAutoCommit(false);
            try {
                PreparedStatement withdrawStatement = con.prepareStatement(withdrawQuery);
                PreparedStatement depositStatement = con.prepareStatement(depositQuery);

                withdrawStatement.setDouble(1, 500.00);
                withdrawStatement.setString(2, "account123");

                depositStatement.setDouble(1, 500.00);
                depositStatement.setString(2, "account789");
                withdrawStatement.executeUpdate();
                depositStatement.executeUpdate();
                con.commit();
                System.out.println("Transaction successful");
            }catch(SQLException e){
                con.rollback();
                System.out.println(e.getMessage());
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
