package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;

class Check{
    boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                check = false;
                break;
            }
        }
        return check;
    }
}

public class CheckSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check obj = new Check();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("enter target: ");
//        int target = sc.nextInt();

        System.out.println("Print Array: "+ Arrays.toString(arr));
        if(obj.isSorted(arr)){
            System.out.println("YES! This is sort array "+Arrays.toString(arr));
        } else{
            System.out.println("NO! This is not sort array "+Arrays.toString(arr));
        }

    }
}
