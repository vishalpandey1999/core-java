package W3School;

import java.util.Arrays;
import java.util.Scanner;

class Question1{


}

public class oneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question1 obj = new Question1();

//        size of Array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element of Array
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        enter string size
        System.out.println("enter string size: ");
        int num1 = sc.nextInt();
        String[] arr_2 = new String[num1];

//        enter element as string
        System.out.println("enter string: ");
        for(int i = 0; i < arr_2.length; i++){
            arr_2[i] = sc.nextLine();
        }
        System.out.println("print numerical Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("print numerical Array after shorting: "+ Arrays.toString(arr));

        System.out.println("print numerical Array: "+ Arrays.toString(arr_2));
        Arrays.sort(arr_2);
        System.out.println("print numerical Array after shorting: "+ Arrays.toString(arr_2));

    }
}
