package Collection_FrameWork;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
//        number.forEach((n)->{
//            System.out.println(n);
//        });
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        number.forEach(method);
    }
}
