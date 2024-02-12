package CodeWithHarryOOPS;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(){}
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
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
