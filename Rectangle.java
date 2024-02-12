package Geometric_Shapes;

public class Rectangle extends Shapes{
    public Rectangle(){}
    public Rectangle(double length, double width){

        super(length,width);
    }
    public double perimeterOfRectangle(double length, double width){

        return 2 * (length + width);
    }

    public double areaOfRectangle(double length, double width){

        return length * width;
    }
}
