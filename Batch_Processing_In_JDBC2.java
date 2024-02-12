package dbConnection;
import java.sql.*;
import java.util.Scanner;
public class Batch_Processing_In_JDBC2 {
    public static void main(String[] args) {

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
            String query = "INSERT INTO employee(id, name, job_title, salary)VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("Name: ");
                String emp_name = sc.nextLine();

                System.out.print("Job_Title: ");
                String job_title = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                System.out.print("ID: ");
                int id = sc.nextInt();


                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,emp_name);
                preparedStatement.setString(3,job_title);
                preparedStatement.setDouble(4,salary);
                preparedStatement.addBatch();
                System.out.print("Add more value Y/N: ");
                String decision = sc.nextLine();
                if(decision.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] batchResult = preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch Executed successfully....");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
