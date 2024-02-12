package Collection_FrameWork;
import java.util.*;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raj Mohan Pandey");
        names.add("Vishal Pandey");
        names.add("Rishabh Pandey");
        names.add("Shivam Tiwari");
        names.add("Manish Tiwari");
        names.add("Satyam Tiwari");
        names.add("Raj Mohan Pandey");
        names.add("Manish Tiwari");
        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain\"Vikas\"? :" +names.contains("Vikas"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf\"Vishal Pandey\"?: " +names.indexOf("Vishal Pandey"));
        System.out.println("indexOf\"Raj Mohan Pandey\"?: " +names.indexOf("Raj Mohan Pandey"));


        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf\"Manish Tiwari\"?: "+names.lastIndexOf("Manish Tiwari"));
        System.out.println("lastIndexOf\"Raj Mohan Pandey\"?: "+names.lastIndexOf("Raj Mohan Pandey"));

    }
}
