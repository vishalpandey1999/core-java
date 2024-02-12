package Chat_gpt_OOPS_Question;

public class Shapes {
    private String color;
    public Shapes(String color){
        this.color = color;
    }

    public double getArea(){
        return 0.0;
    }

    public String getColor(){
        return color;
    }
}

class Circle1 extends Shapes{
    private double radius;

    public Circle1(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle1 extends Shapes{
    private double length;
    private double width;

    public Rectangle1(String color, double length, double width){
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
    public double getArea() {
        return length * width;
    }
}
class Check1{
    public static void main(String[] args) {
        Shapes circle = new Circle1("red", 12);
        circle.getArea();

        System.out.println("Area of Rectangle: ");
        Shapes rectangle = new Rectangle1("blue",14.22,16.0);
        rectangle.getArea();
    }
}
