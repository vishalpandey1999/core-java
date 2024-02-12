package Collection__framework;

import java.util.ArrayList;
import java.util.List;

public class Fifth_addAll {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Mango");
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Grapes");
        System.out.println("Fruits:- " + fruits1);

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        System.out.println("Colors:- " + colors);

//        List<String> comboOfColorAndFruits = new ArrayList<>();
//        comboOfColorAndFruits.addAll(fruits1);
//        comboOfColorAndFruits.addAll(colors);
//        System.out.println("Combination of fruits and colors:- "+comboOfColorAndFruits);

//        List<String> newFruits = (ArrayList<String>) ((ArrayList<String>) fruits1).clone();
//        System.out.println("New Fruits:- "+newFruits);
//        System.out.println(fruits1.isEmpty());


            if (fruits1.isEmpty()) {
                System.out.println("Yes fruits1 collection is  empty");
            } else {
                System.out.println("No fruits1 collection is not empty");

        }
    }
}


