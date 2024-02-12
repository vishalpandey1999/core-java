package SuperPractice;

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
}
public class rectangle_test {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(34.5,21.00);
        Rectangle r2 = new Rectangle(30.5,26.00);
        Rectangle r3 = new Rectangle(14.5,11.00);
        double areaOf = r1.areaOfRectangle();
        System.out.println("Area-1: "+areaOf);
        double parameterOf = r1.parameterOfRectangle();
        System.out.println("Parameter-1: "+parameterOf);

        double areaOf1 = r2.areaOfRectangle();
        System.out.println("Area-2: "+areaOf1);
        double parameterOf1 = r2.parameterOfRectangle();
        System.out.println("Parameter-2: "+parameterOf1);

        double areaOf2 = r3.areaOfRectangle();
        System.out.println("Area-3: "+areaOf2);
        double parameterOf2 = r3.parameterOfRectangle();
        System.out.println("Parameter-3: "+parameterOf2);
    }
}
