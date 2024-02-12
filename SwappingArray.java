package Collection_FrameWork;

import java.util.*;

public class SwappingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");

//        System.out.println("List of Colors: ");
//        for(String color:colors){
//            System.out.print(color+", \n");
//        }


//        swapping
//        Collections.swap(colors,0,2);
//        for(String color2 : colors){
//            System.out.print(color2+", ");
//        }

//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Mango");
//        fruits.add("Banana");
//        fruits.add("Grapes");
//        fruits.add("Orange");
//        System.out.println("List of Fruits ");
//        fruits.forEach(System.out::println);

//        add fruits and colors
//        fruits.addAll(colors);
//        System.out.println("Fruit after adding all list: ");
//        System.out.println(fruits);

//        System.out.println("Original List of Color: "+colors);
//        List<String> newColor = (ArrayList<String>) ((ArrayList<String>) colors).clone();
//        System.out.println("New color: "+newColor);

//        write a program to remove all element from fruits
        System.out.println("Before removing all Elements: "+colors);
//        colors.removeAll(colors);
//        System.out.println("After removing All elements: "+colors);
        System.out.println(colors.isEmpty());
    }
}
