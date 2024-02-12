package Chat_gpt_OOPS_Question;
//Shape class which will be inherited in every class that called hierarchic
class Shape {
    public double calculateArea(){
        return 0.0;
    }

    public void display(){
        System.out.println("This is generic shape:");
    }
}


//class of Circle it extends shape class
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculate(){
        return Math.PI * radius * radius;
    }

    public void display(){
        System.out.println("This is a Circle with radius " + radius);
    }
}


//class of Rectangle it also extends shape class
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("This is a Rectangle with length " + length + " and width " + width);
    }
}

//class of Rectangle it also extends shape class

class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base * height);
    }

    @Override
    public void display() {
        System.out.println("This is a Triangle with base " + base + " and height " + height);
    }
}