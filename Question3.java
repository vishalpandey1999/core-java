package OBJECT_ORIENTED_PROFGRAM;
abstract class Vehicles{
    abstract void speed();
    abstract void stop();
    abstract void start();
}
class Car extends Vehicles{
    private String make;
    private String model;
    private String year;
    private int speedCapacity;

    public Car(String make, String model, String year, int speedCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speedCapacity = speedCapacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getSpeedCapacity() {
        return speedCapacity;
    }

    public void start(){
        System.out.println("Car have been Start now, starting drive now....");
    }

    public void speed(){
        System.out.println("You are increasing your speed now...");
    }

    public void stop(){
        System.out.println("I did reach on my target now and now Stop the car");
    }
    public void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Modal: "+model);
        System.out.println("Year: "+year);
        System.out.println("speedCapacity: "+speedCapacity);
    }
}

class Bike extends Vehicles{
    private String make;
    private String model;
    private String year;
    private int speedCapacity;

    public Bike(String make, String model, String year, int speedCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speedCapacity = speedCapacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getSpeedCapacity() {
        return speedCapacity;
    }

    public void start(){
        System.out.println("Bike have been Start now, starting drive now....");
    }

    public void speed(){
        System.out.println("You are increasing your speed now...(Bike)");
    }

    public void stop(){
        System.out.println("Stop Bike");
    }
    public void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Modal: "+model);
        System.out.println("Year: "+year);
        System.out.println("speedCapacity: "+speedCapacity);
    }

}

public class Question3 {
    public static void main(String[] args) {
       Car c = new Car("Maruti","suzuki 800","2000",190);
       c.start();
       c.speed();
       c.stop();
       c.displayInfo();

    }
}
