package Collection__framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fourth_comparison {
    public static void main(String[] args) {
        List<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Orange");
        c1.add("Apple");
        c1.add("Mango");

        List<String> c2 = new ArrayList<>();
        c2.add("Grapes");
        c2.add("Banana");
        c2.add("Apple");
        c2.add("pomegranate");

//        List<String> c3 = new ArrayList<>();
//        for(String e : c1)
//            c3.add(c2.contains(e) ? "Yes":"No");
//        System.out.println(c3);

//        System.out.println("Original element :-"+c1);
//        List<String> sub_c1 = c1.subList(0,2);
//        System.out.println("sub_list:-"+sub_c1);

//        swapping element
        System.out.println("Original element:- "+c1);
        Collections.swap(c1,0,1);
        System.out.println("After swapping:- "+c1);

    }
}
