package Core_Java;

import java.util.Scanner;

class Car{
    private String company;
    private String name;
    private String model;
    private String year;
    private int price;

    public Car(){} //default constructor
    public Car(String company,String name, String model, String year, int price){
        this.company = company;
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void carDetails(){
        System.out.println("Company Name: "+company);
        System.out.println("Car Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Year: "+ year);
        System.out.println("Price: "+price);
    }
}

public class Car_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Year: ");
        String year = sc.nextLine();

        System.out.println("Price: ");
        int price = sc.nextInt();

        Car c = new Car("Toyota", "fortuner", "legend","2022",2600000);
        c.carDetails();
        Car c1 = new Car(company,name,model,year,price);
        c1.carDetails();
    }
}
