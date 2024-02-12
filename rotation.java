package Tap_Academy;

import java.util.Arrays;
import java.util.Scanner;

class QuestionTap{
    void rotateOne(int [] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

    void rotate(int [] arr, int k){
        int n = arr.length;
        k = k % n;
        if(k < 0){
            k = k + n;
        }
        for(int i = 1; i < n; i++){
            rotateOne(arr);
        }

    }

    void reverse(int[] arr, int left, int right){
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    void Rotation(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        if(k < 0){
            k = k + n;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr,0, n - 1);

    }

}

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionTap obj = new QuestionTap();

        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int [] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter your target: ");
        int target = sc.nextInt();

        System.out.println("Print Array: "+ Arrays.toString(arr));
        obj.Rotation(arr, target);
        System.out.println("Rotate array by one: "+ Arrays.toString(arr));
    }
}
