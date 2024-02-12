package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class rotate {
    int[] rotateArray(int [] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n - k; i < n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n - k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int[] arr,int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    void rotationInPlace(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);


    }

}

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rotate obj = new rotate();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target: ");
        int target = sc.nextInt();

        System.out.println("print array: ");
//        int[] ans = obj.rotateArray(arr,target);
        obj.rotationInPlace(arr,target);
        System.out.println("smallest and largest array: "+ (Arrays.toString(arr)));

    }
}
