package LoveBabbar;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class count{
    int CheckNumber(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 1 ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

public class countMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count obj = new count();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
        System.out.println("Find max : "+obj.CheckNumber(arr));

    }
}
