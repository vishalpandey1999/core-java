package Core_Java;
class Rectangle{
    private double height;
    private double width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double areaOfRectangle(){
        return height * width;
    }

    public double parameterOfRectangle(){
        return 2 * (height + width);
    }

    public void detailOfRectangle(){
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Area of Rectangle: "+areaOfRectangle());
        System.out.println("Area of Parameter: "+parameterOfRectangle());
    }
}
public class Area {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(22.34,20);
        Rectangle r2 = new Rectangle(20.34,25.75);
        Rectangle r3 = new Rectangle(56.78,34.23);
        r1.detailOfRectangle();
        r2.detailOfRectangle();
        r3.detailOfRectangle();
    }
}
