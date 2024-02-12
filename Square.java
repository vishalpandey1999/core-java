package CodeWithHarryOOPS;

public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double areaOfSquare(double side){
        return side * side;
    }

    public double perimeterOfSquare(double side){
        return (4 * side);
    }

    public void aboutSquare(){
        System.out.println("Side of Square: "+getSide());
        System.out.println("Area of square: "+areaOfSquare(this.side));
        System.out.println("Perimeter of square: "+perimeterOfSquare(this.side));
    }
}
