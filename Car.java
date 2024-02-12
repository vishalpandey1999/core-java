package Chat_gpt_OOPS_Question;

import java.util.Scanner;

public class Car {
    private String name;
    private String serialNumber;
    private String color;
    private String model;
    private String year;

    public Car(){}
    public Car(String name, String serialNumber, String color, String model, String year){
        this.name = name;
        this.serialNumber = serialNumber;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void displayCarInfo(){
        System.out.println("Name: "+name);
        System.out.println("Serial Number: "+serialNumber);
        System.out.println("Color: "+ color);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of car: ");
        String name = sc.nextLine();

        System.out.print("Enter the Serial Number of Car: ");
        String serialNumber = sc.nextLine();

        System.out.print("Enter the color of car: ");
        String color = sc.nextLine();

        System.out.print("Enter the model of car: ");
        String model = sc.nextLine();

        System.out.print("Enter the year of car: ");
        String year = sc.nextLine();

        Car car = new Car(name,serialNumber,color,model,year);
        car.displayCarInfo();
    }
}
