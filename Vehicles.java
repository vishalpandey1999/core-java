package Java_OOPS_For_Inter;

public class Vehicles {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicles(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
        System.out.println("Price: "+ price);
    }
    public void start(){
        System.out.println("Vehicle Started..... ");
    }
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicles{
    private String color;

    public Car(String make, String model, int year, double price, String color){
        super(make, model, year, price);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car color: "+color);
    }

    @Override
    public void start() {
        System.out.println("Car Start.....");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop.....");
    }
}
class Bike extends Vehicles{
    private int tyre;
    public Bike(String make, String model, int year, double price, int tyre){
        super(make, model, year, price);
        this.tyre = tyre;
    }

    public int getTyre(){
        return tyre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Tyre: "+tyre);
    }

    @Override
    public void start() {
        System.out.println("Bike start.....");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stop");
    }
}

class Truck extends Vehicles{
    private int loadCapacity;

    public Truck(String make, String model, int year, double price, int loadCapacity){
        super(make, model, year, price);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity of loading: "+loadCapacity);
    }

    @Override
    public void start() {
        System.out.println("Truck Started....");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stop");
    }
}

class Vehicles_Test{
    public static void main(String[] args) {
        Vehicles car = new Car("Toyota","classic",2013,2034230.0,"Black");
        Vehicles bike = new Bike("Honda","Rider",2010,503420.0,2);
        Vehicles truck = new Truck("Ford","F-500",2020,5034030.0,800);

        System.out.println("Car Info: ");
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println("Bike Info: ");
        bike.displayInfo();
        bike.start();
        bike.stop();

        System.out.println("Truck Info: ");
        truck.displayInfo();
        truck.start();
        truck.stop();
    }
}
