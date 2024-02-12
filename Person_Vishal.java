package Chat_gpt_OOPS_Question;

import java.util.Scanner;

public class Person_Vishal {
    private String name;
    private int age;
    private String address;

    public Person_Vishal(){}
    public Person_Vishal(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

class Test_Person{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Person: ");
        String name = sc.nextLine();

        System.out.print("Enter the Age of Person: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Address of Person: ");
        String address = sc.nextLine();

        Person_Vishal pv = new Person_Vishal(name, age, address);

        System.out.println("Name: "+pv.getName());
        System.out.println("Age: "+pv.getAge());
        System.out.print("Address: "+pv.getAddress());
    }
}
