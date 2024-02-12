package SuperPractice;

import java.util.Arrays;
import java.util.Scanner;
class perfect{
    int perfectNumber(int n){
        int perfectAdd = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                perfectAdd += i;
            }
        }
        if(perfectAdd == n){
            return 1;
        }
        return -1;
    }
}

public class perfectSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perfect obj = new perfect();

        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter element :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("print array: "+ Arrays.toString(arr));
        System.out.println("if value is 1 mean true otherwise wrong "+obj.perfectNumber(n));

    }
}
