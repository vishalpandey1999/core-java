package OOPSforSetGet;

import java.util.Scanner;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        // Calculate the semi-perimeter (s)
        double s = (side1 + side2 + side3) / 2.0;

        // Use Heron's formula to calculate the area
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first side: ");
        double first = sc.nextDouble();

        System.out.print("enter first side: ");
        double second = sc.nextDouble();

        System.out.print("enter first side: ");
        double third = sc.nextDouble();

        Triangle t1 = new Triangle(first, second, third);
        System.out.println("Area of Triangle: "+t1.getArea());
        System.out.println("Area of Perimeter: "+t1.getPerimeter());

    }
}

