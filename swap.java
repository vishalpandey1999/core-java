package PWSkills;

import java.util.Scanner;

class Swapping{

  int[] swapValue(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        int[] result = {a, b};
        return result;
    }
}

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Swapping obj = new Swapping();

        System.out.println("enter first element: ");
        int a = sc.nextInt();

        System.out.println("enter second element: ");
        int b = sc.nextInt();

       int[]swapped = obj.swapValue(a, b);
       a = swapped[0];
       b = swapped[1];

        System.out.println("after swapping A: "+ a);
        System.out.println("after swapping B: "+ b);

    }
}
