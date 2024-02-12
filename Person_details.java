package Core_Java;

import java.util.Scanner;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void display_Person_info(){
        System.out.println("Name of Student: "+name);
        System.out.println("Age of Student: "+age);
    }
}
public class Person_details{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name-> ");
        String name = sc.nextLine();

        System.out.print("Age-> ");
        int age = sc.nextInt();
        Person p1 = new Person(name, age);
        p1.display_Person_info();
    }
}
