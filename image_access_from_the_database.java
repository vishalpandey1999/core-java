package dbConnection;

import java.io.*;
import java.sql.*;

public class image_access_from_the_database {
    public static void main(String[] args) {


                String url = "jdbc:mysql://localhost:3306/mydatabase";
                String name = "root";
                String password = "123456";

                String folder_path = "C:\\Users\\user\\OneDrive\\Desktop\\";
                String sql = "SELECT image_data FROM image_table WHERE image_id = (?)";

//        upload a driver in this try block
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Driver loaded successfully......");
                }catch(ClassNotFoundException e){
                    System.out.println(e.getMessage());
                }

                try{
                    Connection connection = DriverManager.getConnection(url,name,password);
                    System.out.println("Connection successfully.....");
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1,1);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    if(resultSet.next()){
                        byte[] image_date = resultSet.getBytes("image_data");
                        String image_path = folder_path +"bhaiya.jpg";
                        OutputStream outputStream = new FileOutputStream(image_path);
                        outputStream.write(image_date);
                        System.out.println("Loaded successfully.....");
                    }else{
                        System.out.println("Failed.....");
                    }
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



