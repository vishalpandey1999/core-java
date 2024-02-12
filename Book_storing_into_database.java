package JDBC_Practice_this_Package;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.*;

public class Book_storing_into_database {
    public static void main(String[] args)throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/school";
        String name = "root";
        String password = "123456";


//    here I'm providing 'insert' sql query for inserting data into the database
        String sql = "INSERT INTO book(title, author) VALUE (?, ?)";

//    loaded driver here

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,name,password);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Book Author Name: ");
            String author = sc.nextLine();

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,title);
            pstmt.setString(2,author);

            int rowEffected = pstmt.executeUpdate();
            if(rowEffected > 0){
                System.out.println("Data inserted successfully.........");
            }else{
                System.out.println("Programme failed.........");
            }
            pstmt.close();
            connection.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
