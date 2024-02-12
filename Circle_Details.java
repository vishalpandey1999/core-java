package Core_Java;
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double areaOfCircle(){
        return radius * radius;
    }
}
public class Circle_Details {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(8.5);
        Circle c3 = new Circle(31.5);
        Circle c4 = new Circle(300.5);
        System.out.println("Radius: "+c1.areaOfCircle());
        System.out.println("Radius: "+c2.areaOfCircle());
        System.out.println("Radius: "+c3.areaOfCircle());
        System.out.println("Radius: "+c4.areaOfCircle());
    }
}
