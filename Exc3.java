package JDBC_Practice_this_Package;
import java.sql.*;
public class Exc3 {
    public static void main(String[] args)throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/accounts";
        String name = "root";
        String password = "123456";

        String withdrawQuery = "UPDATE account SET balance = balance - ? WHERE account_number = ? AND account_holder = ?";
        String depositQuery = "UPDATE account SET balance = balance + ? WHERE account_number = ? AND account_holder = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,name,password);
            System.out.println("successfully connected......");

            connection.setAutoCommit(false);
            try(PreparedStatement withdrawStatement = connection.prepareStatement(withdrawQuery);
            PreparedStatement depositStatement = connection.prepareStatement(depositQuery)){

                withdrawStatement.setDouble(1,6553.45);
                withdrawStatement.setString(2,"account006");
                withdrawStatement.setString(3,"Shivam Tiwari");

                depositStatement.setDouble(1,6553.45);
                depositStatement.setString(2,"account001");
                depositStatement.setString(3,"Vishal Pandey");
                withdrawStatement.executeUpdate();
                depositStatement.executeUpdate();
                connection.commit();
                System.out.println("Transaction successfully.....");

            }catch (SQLException e){
                connection.rollback();
                System.out.println(e.getMessage());
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
