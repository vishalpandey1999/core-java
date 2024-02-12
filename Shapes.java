package Geometric_Shapes;

public class Shapes {
         double side;
         double height;
         double width;
         double pi;
         double length;

        public double getLength() {
                return length;
        }

        public Shapes(){};

        public Shapes(double height, double side, double width, double length){
                this.side = side;
                this.height = height;
                this.width = width;
                pi = Math.PI;
        }
        public Shapes(double height, double width, double length){
                this.length = length;
                this.height = height;
                this.width = width;
        }
        public Shapes(double height, double width){
                this.height = height;
                this.width = width;
                pi = Math.PI;
        }

        public Shapes(double side){
                System.out.println("Inherit this constructor by the square class");
                this.side = side;
        }

        public double getSide() {
                return side;
        }

        public double getHeight() {
                return height;
        }

        public double getWidth() {
                return width;
        }


}
