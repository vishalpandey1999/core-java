package Collection_FrameWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1);
        num.add(5);
        num.add(4);




      List<Integer> num1=  num.stream().distinct().toList();
      num.forEach(System.out::println);
        System.out.println("remove duplicate");

        num1.forEach(System.out::println);
    }
    }

