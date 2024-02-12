package W3School;

import java.util.Arrays;
import java.util.Scanner;

class vishal{

    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}

public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vishal obj = new vishal();
//      size
        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        enter element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        int [] arr_2 = arr.clone();
        System.out.println("Array without using clone: "+Arrays.toString(arr_2));
        arr_2[0] = 5;
        arr_2[2] = 10;
        arr_2[4] = 15;
        System.out.println("after changing some value of arr_2 : "+Arrays.toString(arr));
        System.out.println("Array without using clone again: "+Arrays.toString(arr_2));




    }
}
