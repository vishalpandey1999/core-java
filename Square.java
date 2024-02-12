package Geometric_Shapes;
public class Square extends Shapes{
    public Square(double side){
        super(side);

    }


    public double AreaOfSquare(double side){

        return this.side
                * this.side;
    }



    public void color(){

        System.out.println("Color the square as your wish");
    }
}
