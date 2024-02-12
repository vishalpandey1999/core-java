package Company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {
    public static Connection getConnection()throws SQLException {
       String url = "jdbc:mysql://localhost:3306/company";
       String name = "root";
       String password = "123456";

       return DriverManager.getConnection(url,name,password);
    }

    public static void insertEmployee(String name, String job_title, double salary) {
        String insertQuery = "INSERT INTO employee(name, job_title, salary) VALUE (?,?,?)";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {

            pstmt.setString(1, name);
            pstmt.setString(2, job_title);
            pstmt.setDouble(3, salary);

            int rowEffected = pstmt.executeUpdate();
            if (rowEffected > 0) {
                System.out.println("Data insert successfully..........");
            } else {
                System.out.println("Something wrong check and try again........");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

        public static void updateSalary(int id, double newSalary){
            String updateQuery = "UPDATE employee SET salary = ? WHERE id = ?";

            try(Connection connection = getConnection();
              PreparedStatement ptmt = connection.prepareStatement(updateQuery)){
              ptmt.setDouble(1, newSalary);
              ptmt.setInt(2, id);
              int rowEffected = ptmt.executeUpdate();
              if(rowEffected > 0){
                  System.out.println("one row effected it means update successfully");
              }else{
                  System.out.println("something wrong......");
              }
              ptmt.close();
              connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Employee Name:- ");
//        String name = sc.nextLine();
//
//        System.out.print("Job Title:- ");
//        String job_title = sc.nextLine();
//
//        System.out.print("Salary:- ");
//        double salary = sc.nextInt();
//
//        insertEmployee(name, job_title, salary);
        updateSalary(1,50000.00);

    }
}
