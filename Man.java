package Core_Java;

import java.util.Scanner;

public class Man {
    private String name;
    private int age;
    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Man(){}
    public Man(String name){
        this.name = name;
    }

    public Man(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void manInfo(){
        System.out.print("Name: "+name);
        System.out.print("Age: "+age);
    }
}

class ManDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        Man m1 = new Man(name, age);
        m1.manInfo();
    }
}
