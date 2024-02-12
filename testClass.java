package Geometric_Opration;

import java.util.Scanner;
import Geometric_Opration.Rectangle;

public class testClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double dim1 = sc.nextDouble();

        System.out.print("Enter the height: ");
        double dim2 = sc.nextDouble();
        Rectangle r1 = new Rectangle(dim1,dim2);

        double areaOfRectangle = r1.area();
        System.out.println("Area Of Rectangle: "+areaOfRectangle);

        double perimeterOfRectangle = r1.perimeter();
        System.out.println("Perimeter Of Rectangle: "+perimeterOfRectangle);

    }
}
