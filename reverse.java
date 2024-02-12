package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class ReverseM{
    int[] reverseNumber(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i = n - 1; i >= 0; i--){
            ans[k++] = arr[i];
        }
        return ans;
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    void reverse3(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseM obj = new ReverseM();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array:"+ Arrays.toString(arr));
//        obj.reverse3(arr);
        System.out.println("First Repeating value:"+Arrays.toString(obj.reverseNumber(arr)));
    }
}
