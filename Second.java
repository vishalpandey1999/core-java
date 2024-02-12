package Collection__framework;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Litchi");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

//        first type of iteration
//        fruits.forEach(System.out::println);

//        second type of iteration

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

//        fruits.set(0,"NewApple");
//        for(String fruit : fruits){
//           System.out.println(fruit);
//        }
//        System.out.println("Enter The Position:- ");
//        int pos = sc.nextInt();
//
//        System.out.println("Fruits  :- "+fruits.get(pos)+" on the "+pos+" position");


//        update the element
//        fruits.set(1,"Apple");
//        System.out.println(fruits);

//        remove the third element from the fruits collection
//        by index
//        fruits.remove(4);
//        System.out.println(fruits);
//        by name
//        fruits.remove("Apple");
//        System.out.println(fruits);


//        searching the element in the fruits collection
//        System.out.println(fruits.contains("Red"));

        System.out.println("Fruits:- "+fruits);
        Collections.sort(fruits);
        System.out.println("After the sorting:- "+fruits);
    }
}
