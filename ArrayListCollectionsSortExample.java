package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(81);
        list.add(18);
        list.add(23);
        list.add(16);
        System.out.println("Before: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);

        List<String> name = new ArrayList<>();
        name.add("Vishal");
        name.add("Raj");
        name.add("shivam");
        name.add("Ashu");
        name.add("Manish");
        name.add("Shyam");

        System.out.println("Name: "+name);
//        name.sort(new Comparator<String>() {
//            @Override
//            public int compare(String name1, String name2) {
//                return name1.compareTo(name2);
//            }
//        });
//        name.sort((name1, name2) -> name1.compareTo(name2));
//        name.sort(Comparator.naturalOrder());
//
//        System.out.println("Sorted Names : " + name);
        Collections.sort(name);
    }
}
