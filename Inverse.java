package Tap_Academy;

import java.util.Arrays;
import java.util.Scanner;

class Inver{
    int [] InverseArray(int[] arr){
        int [] arr_2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            arr_2[value] = i;
        }
        return arr_2;
    }
}

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inver obj = new Inver();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter Element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
        int[] ans = obj.InverseArray(arr);
        System.out.println("Inverse Of Array: "+ Arrays.toString(ans));
    }
}
