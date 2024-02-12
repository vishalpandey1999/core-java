package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class repeat{
    int repeatingValue(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

public class repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repeat obj = new repeat();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array:"+ Arrays.toString(arr));
        System.out.println("First Repeating value:"+obj.repeatingValue(arr));
    }
}
