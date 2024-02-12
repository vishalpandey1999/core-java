package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class Numbers{
    int[] SmallestAndLargest(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;
         return result;
    }
}

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numbers obj = new Numbers();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("print array: ");
        int[] result = obj.SmallestAndLargest(arr);
        System.out.println("smallest and largest array: "+ Arrays.toString(result));
    }
}
