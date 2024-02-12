package Chat_gpt_OOPS_Question;

public class Personalty {
    private String name;
    private int age;
    private double height;
    private String citizenship;

    public Personalty(String name, int age, double height, String citizenship){
        this.name = name;
        this.age = age;
        this.height = height;
        this.citizenship = citizenship;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void displayInfo(){
        System.out.println("Name -> "+name);
        System.out.println("Age -> "+age);
        System.out.println("Height -> "+height);
        System.out.println("Citizenship -> "+citizenship);
    }
}

class Check{
    public static void main(String[] args) {
        Personalty p1 = new Personalty("Vishal", 23, 5.9,"Bharti");
        Personalty p2 = new Personalty("Raj", 33, 5.9,"English");
        Personalty p3 = new Personalty("Manish Tiwari", 38, 5.8,"Australia");
        Personalty p4 = new Personalty("Shivam", 26, 6.0,"Pakistani");
        Personalty p5 = new Personalty("Ashu Tiwari", 25, 5.5,"Aundman Nicobar");
        Personalty p6 = new Personalty("Rishabh", 19, 6.2,"Afghanistan");

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
        p5.displayInfo();
        p6.displayInfo();
    }
}
