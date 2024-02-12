package Core_Java;

import java.util.Scanner;

class Cir_cul {
    private double radius;

    public Cir_cul(double radius){
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI * radius * radius;
    }

    public void circleInfo(){
        System.out.println("Radius Of Circle ->"+radius);
        System.out.println("Area of Circle -> "+areaOfCircle());
    }
}
class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Cir_cul c1 = new Cir_cul(radius);
        c1.areaOfCircle();
        c1.circleInfo();
    }
}
