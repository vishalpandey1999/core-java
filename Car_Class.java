package Chat_gpt_OOPS_Question;

public class Car_Class {

    private String name;
    private String make;
    private String model;
    private String year;
    private int price;

    public Car_Class(){};  //Default constructor
    public Car_Class(String name,String make, String model){  //parameterize constructor
        this.name = name;
        this.make = make;
        this.model = model;
    }

    public Car_Class(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Car_Class(String name, String model, String make, String year, int price){
        this.name = name;
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    public void displayCarInfo(){
        System.out.println("Car Name -> "+name);
        System.out.println("Car Make -> "+make);
        System.out.println("Car Model -> "+model);
        System.out.println("Car Year -> "+year);
        System.out.println("Car Price -> "+price);
    }
}

class Car_Info{
    public static void main(String[] args) {

        Car_Class cc = new Car_Class("Maruti", "Maruti", "S-100");
        Car_Class cc2 = new Car_Class("Thar", "T-100", 160000);
        Car_Class cc3 = new Car_Class("Defender", "Legend", "Range Rover", "2021", 13000000);

        cc.displayCarInfo();
        cc2.displayCarInfo();
        cc3.displayCarInfo();
    }
}
