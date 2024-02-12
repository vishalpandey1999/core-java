package Collection_FrameWork;

import java.util.ArrayList;

public class Add_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//        Add method
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
//        addAll method
       list2.add(6);
       list2.add(7);
       list2.add(8);
       list2.add(9);
//       list1.addAll(list2);
//        clear method
       list2.clear();

//       contain method
        System.out.println(list2.contains(6));
//        for(int i = 0; i < list1.size(); i++){
//            System.out.print(list1.get(i));
//            System.out.print(", ");
//        }
    }
}
