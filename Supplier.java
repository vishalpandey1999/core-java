package Inventory_Management_System;

public class Supplier {
    private String name;
    private String contactNumber;
    private String email;

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public Supplier(String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public void displayInformation(){
        System.out.println("Name:- "+name);
        System.out.println("Contact Number:- "+contactNumber);
        System.out.println("Email:- "+email);
    }
}
