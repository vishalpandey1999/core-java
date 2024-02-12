package Chat_gpt_OOPS_Question;

import java.util.Scanner;

public class Collage_Student {
    private String name;
    private int rollNo;
    private double mark;

    public Collage_Student(String name, int rollNo, double mark){
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMark() {
        return mark;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Student Array: ");
        int num = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        Collage_Student[] students = new Collage_Student[num];

        System.out.println("Enter the Element of Student array: ");
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter detail for student: "+(i+1)+" :");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No. : ");
            int rollNo = sc.nextInt();

            System.out.print("Mark: ");
            double mark = sc.nextDouble();

            sc.nextLine(); // Consume the newline character
            students[i] = new Collage_Student(name, rollNo, mark);
        }

        double totalMark = 0.0;
        for(Collage_Student student : students){
            totalMark += student.getMark();
        }

        double averageMark = totalMark/ students.length;

        System.out.println("Average Mark: "+ averageMark);

        sc.close();
    }
}
