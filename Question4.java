package OBJECT_ORIENTED_PROFGRAM;
abstract class Animals{
    abstract void makeSound();
}

class Cat extends Animals{
    private String bread;
    private String name;

    public Cat(String bread, String name) {
        this.bread = bread;
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("May-aau");
    }

    public void displayInfo(){
        System.out.println("Bread: "+bread);
        System.out.println("Name: "+name);
    }
}

class Dog extends Animals{
    private String bread;
    private String name;

    public Dog(String bread, String name) {
        this.bread = bread;
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("Barking");
    }

    public void displayInfo(){
        System.out.println("Bread: "+bread);
        System.out.println("Name: "+name);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Dog d = new Dog("Bull Dog", "Rocky");
        d.makeSound();
        d.displayInfo();
    }
}
