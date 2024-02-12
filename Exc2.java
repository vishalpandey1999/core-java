package JDBC_Practice_this_Package;
import java.sql.*;
public class Exc2 {
    public static void main(String[] args)throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/accounts";
        String name = "root";
        String password = "123456";

        String withdrawQuery = "UPDATE account SET balance = balance - ? WHERE account_number = ? AND account_holder = ?";
        String depositQuery = "UPDATE account SET balance = balance + ? WHERE account_number = ? AND account_holder = ?";

//        here I'm Loading Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully....");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

//        here I'm trying to establish a connection with database
        try{
            Connection con = DriverManager.getConnection(url,name, password);
            System.out.println("Connection establish");
            con.setAutoCommit(false);
            try(PreparedStatement withdrawStatement = con.prepareStatement(withdrawQuery);
              PreparedStatement depositStatement = con.prepareStatement(depositQuery)){

//                Here we are set the value which are needed for us (I mean for transaction)
                depositStatement.setDouble(1,45360);
                depositStatement.setString(2,"account003");
                depositStatement.setString(3,"Vinay Pandey");

                withdrawStatement.setDouble(1,45360);
                withdrawStatement.setString(2,"account005");
                withdrawStatement.setString(3,"Manish Tiwari");
                withdrawStatement.executeUpdate();
                depositStatement.executeUpdate();
                con.commit();
                System.out.println("transaction successfully.....");
            }catch(SQLException e){
                con.rollback();
                System.out.println(e.getMessage());
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
