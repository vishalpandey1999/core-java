package Hotal_Management_System;
import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {

    private static final String url= "jdbc:mysql://localhost:3306/hotal_db";
    private static final String name= "root";
    private static final String password= "123456";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Just Loaded Driver here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver ");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

//        now I'm creating connection here with Hotal_db database

        try{
            Connection connection = DriverManager.getConnection(url,name,password);

            while(true){
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a room ");
                System.out.println("2. View Reservation ");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations ");
                System.out.println("5. Delete Reservations ");
                System.out.println("0. Exit ");

                System.out.print("Choose an option : ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        reserveRoom(connection, scanner);
                        break;
                    case 2:
                        viewReservations(connection);
                        break;
                    case 3:
                        getRoomNumber(connection, scanner);
                        break;
                    case 4:
                        updateReservations(connection, scanner);
                        break;
                    case 5:
                        deleteReservations(connection, scanner);
                    case 0:
                        exit();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice, Try again");
                }
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    private static void reserveRoom(Connection connection, Scanner scanner){
        try{
            System.out.println("Enter guest name: ");
            String guestName = scanner.next();
            scanner.nextLine();
            System.out.println("Enter room number: ");
            int roomNumber = scanner.nextInt();

            System.out.println("Enter your contact number: ");
            String contactNumber = scanner.next();

            String sql = "INSERT INTO reservations(guest_name, room_number, contact_number) " +
                    "VALUES('"+guestName+"', '"+roomNumber+"', '"+contactNumber+"')";

            try(Statement statement = connection.createStatement()) {
                int rowsAffected = statement.executeUpdate(sql);

                if(rowsAffected > 0){
                    System.out.println("Reservation Successfully !!!");
                }else{
                    System.out.println("Reservation Failed");
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private static void viewReservations(Connection connection){
        String sql = "SELECT reservation_id, guest_name, room_number, contact_number, reservation_date FROM reservations";

        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)){

            while(rs.next()){
                int reservationId = rs.getInt("reservation_id");
                String guestName = rs.getString("guest_name");
                int roomNumber = rs.getInt("room_number");
                String contactNumber = rs.getString("contact_number");
                Timestamp reservationDate = rs.getTimestamp("reservation_date");
                System.out.println("========================================================================");
                System.out.println();
                System.out.println("Reservation_Id: "+reservationId);
                System.out.println("Guest Name: "+guestName);
                System.out.println("Room Number: "+roomNumber);
                System.out.println("Contact Number: "+contactNumber);
                System.out.println("Reservation Date: "+reservationDate);
                System.out.println();
                System.out.println("========================================================================");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private static void getRoomNumber(Connection connection, Scanner scanner){
        System.out.println("Enter reservation Id: ");
        int reservationId = scanner.nextInt();

        System.out.println("Enter guest name: ");
        String guestName = scanner.next();

        String sql = "SELECT room_number FROM reservations " +
                "WHERE reservation_id = "+reservationId+ " AND guest_name = '"+guestName+"'";

        try(Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)){
            if(rs.next()) {
                int roomNumber = rs.getInt("room_number");
                System.out.println("Room number for Reservation Id " + reservationId + "" +
                        " and Guest " + guestName + " is " + roomNumber);
            }else{
                System.out.println("Reservation not found for the given Id And name ");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static  void updateReservations(Connection connection, Scanner scanner){
        try{
            System.out.println("Enter reservation Id To update: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if(!reservationExists(connection, reservationId)){
                System.out.println("Reservation not fount the give Id");
                return;
            }

            System.out.println("Enter guest name: ");
            String guestName = scanner.next();
            scanner.nextLine();
            System.out.println("Enter room number: ");
            int roomNumber = scanner.nextInt();

            System.out.println("Enter your contact number: ");
            String contactNumber = scanner.next();

            String sql = "UPDATE reservations SET guest_name '"+guestName+"', "+
                    "room_number = "+roomNumber+", contact_number = "+contactNumber+"'"+
                    "WHERE  reservation_id = "+reservationId;
            try(Statement statement = connection.createStatement()){
                int rowsAffected = statement.executeUpdate(sql);
                if(rowsAffected > 0){
                    System.out.println("Update Successfully.....");
                }else{
                    System.out.println("Reservation Update failed");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void deleteReservations(Connection connection, Scanner scanner){
        try{
            System.out.println("Enter your reservation ID: ");
            int reservationId = scanner.nextInt();

            if(!reservationExists(connection, reservationId)){
                System.out.println("Reservation not found for given id");
                return;
            }
            String sql = "DELETE FROM reservations WHERE reservation_id = "+reservationId;

            try(Statement statement = connection.createStatement()){
                int rowsAffected = statement.executeUpdate(sql);
                if(rowsAffected > 0){
                    System.out.println("Reservation delete successfully! ");
                }else{
                    System.out.println("Reservation deletion failed");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static boolean reservationExists(Connection connection, int reservationId){
        try{
            String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = "+reservationId;

            try(Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(sql)){
                return rs.next();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static void exit() throws InterruptedException{
        System.out.print("Existing System");
        int i = 5;
        while(i != 0){
            System.out.print(".");
            Thread.sleep(450);
            i--;
        }
        System.out.println();
        System.out.println("Thank you for using hotel reservation system" );
    }
}
