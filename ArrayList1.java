package Collection_FrameWork;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        ArrayList<String> birds = new ArrayList<>();
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Mouse");
        animal.add("Cow");
        animal.add("Monkey");
        animal.add("Panther");

//        Here is a method of ArrayList Like add() & get();
            System.out.println("Animal Of Here "+animal.get(1));
            animal.add(1,"Elephant");
            System.out.println(animal.get(1));

//        Here we will use addAll() method by using this method
        birds.add("Sparrow");
        birds.add("Crow");
        birds.add("Duck");
        birds.add("Parrot");
        birds.add("Pigeon");
//        for (String bird : birds) {
//            System.out.println("Bird Are Here :-" + bird);
//        }
//        birds.add(2,"Hen");
//        for (String bird : birds) {
//            System.out.println("Bird Are Here:-" + bird);
//        }
//        AddAll() use here
        birds.addAll(animal);
        for (String bird : birds) {
            System.out.println("Animals :-" + bird);
        }
        System.out.println("Here I'm using method like contain, get, isEmpty");
        System.out.println(birds.contains("cow"));
        System.out.println(birds.remove(5));
//        System.out.println("Remove Element:"+birds.get(5));
        birds.add(5,"Vishal");
        System.out.println(birds.isEmpty());
    }
}
