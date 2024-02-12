package Core_Java;

import java.util.Scanner;

class Rectangle_Area{
    private double length;
    private double width;
    public Rectangle_Area(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double areaOfRectangle(){
        return length * width;
    }

    public void displayRectangleDetails(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("Area of Rectangle: "+ areaOfRectangle());

    }
}

public class Rect_Angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length-> ");
        double length = sc.nextDouble();

        System.out.print("Width-> ");
        double width = sc.nextFloat();

        Rectangle_Area ra = new Rectangle_Area(length,width);
        ra.areaOfRectangle();
        ra.displayRectangleDetails();

    }
}
