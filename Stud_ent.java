package Core_Java;

import java.util.Scanner;

public class Stud_ent {
    private String name;
    private int rollNo;
    private double grade;
    public Stud_ent(String name, int rollNo, double grade){
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    public Stud_ent(){};

    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getGrade() {
        return grade;
    }

    public void studentInfo(){
        System.out.println("Name Of Student: "+name);
        System.out.println("Roll Number of Student: "+rollNo);
        System.out.println("Grade of Student:"+ grade);
    }
}

class StudentDetails_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll NUmber:");
        int rollNo = sc.nextInt();

        System.out.print("Grade: ");
        double grade = sc.nextDouble();

        Stud_ent s1 = new Stud_ent();
        s1.setName(name);
        s1.setRollNo(rollNo);
        s1.setGrade(grade);

        s1.studentInfo();
    }
}
