package OOPSforSetGet;

import java.util.Scanner;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }

    public float getPerimeter(){
        return 2 * (length * width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = sc.nextFloat();

        System.out.println("Enter width: ");
        float width = sc.nextFloat();

        Rectangle r1 = new Rectangle(length, width);
        System.out.println("Area : "+r1.getArea()+" Perimeter is "+ r1.getPerimeter());
    }
}
