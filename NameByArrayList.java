package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class NameByArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(3);
        names.add("Vishal");
        names.add("ViKas");
        names.add("Vinay");
        names.add("Ram");
        System.out.println("Names: "+names);
        ((ArrayList<String>) names).ensureCapacity(6);
        names.add("Shyam");
        names.add("Ramesh");
        names.add("Raju");
        System.out.println("Names: "+names);
    }
}
