package Tap_Academy;

import java.util.Arrays;
import java.util.Scanner;
class subSet{
    void subsets(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
        }
    }
}

public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subSet obj = new subSet();

        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
        obj.subsets(arr);
        System.out.println("Sub Array: "+ arr);
    }
}
