package Core_Java;

public class HelloWorld {
/** public -> This is access modifier,
 * access modifier are 4 type
 * (1)Public -> accessible everywhere
 * (2)Private -> this is accessible within the same class, it can not access out of the class(other class)
 * (3)Protected
 * (4)Default -> if user would not define any type of access modifier that's call default modifier
 * HelloWorld is the name of class*/
    public static void main(String[] args) {
        /** public -> access modifier
         *  static -> it  doesn't need object for getting access
         *  void -> return type
         *  main -> function name*/

        System.out.println("Hello World");
        /**
         * System -> class name
         * out -> reference variable which contain functionality of any type of object which works for printing
         * println -> this is method name*/

    }
}
