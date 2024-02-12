package Core_Java;

public class Type_conversion {
    public static void main(String[] args) {
        int y = 3;

//        widening Conversion, no error because there not data lose
        float x = y;
        System.out.println(x);

//        Narrowing conversion error because there are data lose
        float a = 3.4f;
        int b = (int)a; //if I will define b with data type int than it through error ,there can be happening data lose so use type casting
        System.out.println(b);
    }
}
