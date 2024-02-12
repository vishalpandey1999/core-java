package Core_Java;

import java.util.Scanner;

public class ShapeOfAllStructure {
    private String color;
    public ShapeOfAllStructure(String color){
        this.color = color;
    }

    public double area(){
        return 0.0;
    }
}

class Rectangle5 extends ShapeOfAllStructure{
    private double length;
    private double width;

    public Rectangle5(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class many{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length-> ");
        double length = sc.nextDouble();

        System.out.print("width-> ");
        double width = sc.nextDouble();

        Rectangle5 r5 = new Rectangle5("red",length,width);
        double ans = r5.area();
        System.out.println(ans);
    }
}
