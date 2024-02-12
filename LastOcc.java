package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;

class Last{
    int LastOccurrence(int[] arr, int x){
        int n = arr.length;
        int lastIndex = -1;
        for(int i = 0; i < n; i++){
            lastIndex = i;
        }
        return lastIndex;
    }
}

public class LastOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Last obj = new Last();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target: ");
        int target = sc.nextInt();

        System.out.println("Print Array: "+ Arrays.toString(arr));
        System.out.println("Find Index of presenting number : "+obj.LastOccurrence(arr, target));

    }
}
