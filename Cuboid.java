package Geometric_Shapes;

public class Cuboid extends Shapes {
    public Cuboid(double length, double height, double width){
        super(length, width, height);
    }

    public double totalSurfaceAreaOfCuboid(double length, double height, double width){
        return 2*( (length*width) + (width*height) + (length*height));
    }

    public double CurvedSurfaceAreaOfCuboid(double length, double height, double width){
        return 2*( (length*width) + (width*height) + (length*height));
    }
}
