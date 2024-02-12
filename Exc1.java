package JDBC_Practice_this_Package;
import java.sql.*;

public class Exc1 {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/accounts";
        String name = "root";
        String password = "123456";
        String withdrawQuery = "UPDATE account SET balance = balance - ? WHERE account_number = ? AND account_holder = ?";
        String depositQuery = "UPDATE account SET balance = balance + ? WHERE account_number = ? AND account_holder = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.........");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (Connection connection = DriverManager.getConnection(url, name, password)) {
            System.out.println("Java successfully connected with the database");

            connection.setAutoCommit(false);
            try (PreparedStatement withdrawStatement = connection.prepareStatement(withdrawQuery);
                 PreparedStatement depositStatement = connection.prepareStatement(depositQuery)) {

                // Assuming account_number is a String and account_holder is also a String in the database
                withdrawStatement.setDouble(1, 5000.00);
                withdrawStatement.setString(2, "account004");
                withdrawStatement.setString(3, "Raj Pandey");

                depositStatement.setDouble(1, 5000.00);
                depositStatement.setString(2, "account001");
                depositStatement.setString(3, "Vishal Pandey");

                withdrawStatement.executeUpdate();
                depositStatement.executeUpdate();
                connection.commit();
                System.out.println("Transaction successfully....");
            } catch (SQLException e) {
                connection.rollback();
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
