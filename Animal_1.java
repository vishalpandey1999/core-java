package Chat_gpt_OOPS_Question;

import java.util.Scanner;

public class Animal_1 {
    private String name;
    private int age;

    public Animal_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a Sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Cat extends Animal_1 {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Puppy extends Animal_1 {
    private String color;

    public Puppy(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barking");
    }
}

class AnimalInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Animal Name: ");
        String name = sc.nextLine();

        System.out.print("Animal age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Animal color: ");
        String color = sc.nextLine();

        // Create instances of Cat and Puppy using the input
        Cat cat = new Cat(name, age, color);
        Puppy puppy = new Puppy(name, age, color);

        // Display information and sounds
        System.out.println("\nCat Information:");
        cat.displayInfo();
        cat.makeSound();

        System.out.println("\nPuppy Information:");
        puppy.displayInfo();
        puppy.makeSound();

        sc.close();
    }
}
