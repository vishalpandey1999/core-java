package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(45);
        number.add(89);
        number.add(78);
        number.add(23);
        number.add(12);

        Iterator<Integer> numberIterator = number.iterator();
        while (numberIterator.hasNext()){
            Integer num = numberIterator.next();
            if(num % 2 != 0){
                numberIterator.remove();
            }
        }
        System.out.println(number);
    }
}
