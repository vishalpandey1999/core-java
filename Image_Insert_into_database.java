package dbConnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class Image_Insert_into_database {

    public static void main(String[] args)throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String name = "root";
        String password = "123456";

        String image_path = "C:\\Users\\user\\OneDrive\\Desktop\\bunty bhaiya.jpg";
        String sql = "INSERT INTO image_table(image_data) VALUES(?)";

//        upload driver in this try block
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully......");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,name,password);
            System.out.println("Connection successfully.....");

//            this method use for change image data into the bytes.....
            FileInputStream fileInputStream = new FileInputStream(image_path);
            byte[] image_data = new byte[fileInputStream.available()];
            fileInputStream.read(image_data);

//            now using a prepared statement for running query
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBytes(1,image_data);
            int affectedRows = preparedStatement.executeUpdate();

            if(affectedRows > 0){
                System.out.println("Image inserted successfully......");
            }else {
                System.out.println("Image not inserted successfully.....");
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
