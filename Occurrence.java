package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class Counting{
    int Repeating(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                count++;
            }
        }
        return count;
    }

}

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Counting obj = new Counting();

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
        System.out.println("Find Index of presenting number : "+obj.Repeating(arr, target));

    }
}
