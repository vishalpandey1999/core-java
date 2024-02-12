package Core_Java;

import java.util.Scanner;

public class Per_son {
    private String name;
    private int age;
    private String address;

    public Per_son(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayPersonInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}

class PersonalDetail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Per_son p1 = new Per_son(name, age,address);
        p1.displayPersonInfo();
    }
}
