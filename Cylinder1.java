package CodeWithHarryOOPS;

public class Cylinder1 extends Circle{
    private double height;
    public Cylinder1(){}
    public Cylinder1(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double volumeOfCylinder(double radius, double height){
        return (Math.PI * radius * radius * height);
    }

    public double totalSurfaceAreaOfCylinder(double radius, double height){
        return 2 * Math.PI * radius * (radius + height);
    }

    public double CurvedSurfaceAreaOfCylinder(double radius, double height){
        return (2 * Math.PI * radius * height);
    }
}
