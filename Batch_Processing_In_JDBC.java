package dbConnection;
import java.sql.*;
public class Batch_Processing_In_JDBC {
    public static void main(String[] args)throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String name = "root";
        String password = "123456";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.....");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,name,password);
            System.out.println("Java connected with JDBC....");
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO employee(id,name, job_title, salary) VALUES(12,'shivam', 'HR Manger', 60000.00)");
            statement.addBatch("INSERT INTO employee(id,name, job_title, salary) VALUES(45,'Manish Tiwari', 'ABM', 67000.00)");
            statement.addBatch("INSERT INTO employee(id,name, job_title, salary) VALUES(65,'Vikas', 'MR', 16000.00)");
            int[] batchResult = statement.executeBatch();
            connection.commit();
            System.out.println("Batch Executed Successfully!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
