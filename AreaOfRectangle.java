package OOPSforSetGet;

import java.util.Scanner;

public class AreaOfRectangle {
    private float length;
    private float width;

    public void setArea(float length, float width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        float length = sc.nextFloat();

        System.out.println("enter width: ");
        float width = sc.nextFloat();

        AreaOfRectangle area = new AreaOfRectangle();
        area.setArea(length, width);

        double rectangleArea = area.getArea();
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
