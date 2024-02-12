package JDBC_Practice_this_Package;
import java.sql.*;
public class Exc4 {
    public static void main(String[] args)throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/accounts";
        String name = "root";
        String password = "123456";

        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully......");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,name, password);
            System.out.println("connection successfully.....");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.addBatch("INSERT INTO account(account_number, account_holder, balance) VALUES('account009','Rajesh Mishra',340982.00)");
            stmt.addBatch("INSERT INTO account(account_number, account_holder, balance) VALUES('account10','Raju Kesharvani',1340982.00)");
            stmt.addBatch("INSERT INTO account(account_number, account_holder, balance) VALUES('account11','Mahesh Rana',3400032.10)");
            stmt.addBatch("INSERT INTO account(account_number, account_holder, balance) VALUES('account12','M.S.Dhoni',16422.00)");
            stmt.addBatch("INSERT INTO account(account_number, account_holder, balance) VALUES('account13','Virat Kohli',12334.40)");

            int[] resultSet = stmt.executeBatch();
            con.commit();
            System.out.println("Batch executed successfully.......");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
