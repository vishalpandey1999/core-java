package Core_Java;

class Box{
    private int length, width, height;
//    create set function for set vale
    public void setDimension(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }

    public void getDimension(){
        System.out.println("Length : "+length);
        System.out.println("width : "+width);
        System.out.println("height : "+height);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(12,10,5);
        b1.getDimension();
        b1 = new Box();
        b1.setDimension(5,10,12);
        b1.getDimension();
    }
}
