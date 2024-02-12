package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class fruit {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Black Barry");

//        fruits.forEach(System.out::println);
//        System.out.println("Original array list: " + fruits);
//        System.out.println("Checking the above array list is empty or not! "+fruits.isEmpty());
//        fruits.removeAll(fruits);
//        System.out.println("Array list after remove all elements "+fruits);
//        System.out.println("Checking the above array list is empty or not! "+fruits.isEmpty());

        System.out.println("Original Array List: "+fruits);
        System.out.println("Let trim to size the above array: ");
        ((ArrayList<String>) fruits).trimToSize();
        System.out.println(fruits);
    }
}
