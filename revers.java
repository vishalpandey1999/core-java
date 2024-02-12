package W3School;

import java.util.Arrays;
import java.util.Scanner;

class reverse{
    int[] reverseArray1(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n - 1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    int[] reverseArray2(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int i = n - 1, j = 0;
        while (i >= 0){
            ans[j++] = arr[i--];
        }
        return ans;
    }

    void sweptInArray(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverseArray3(int[] arr,int i, int k){
        i = 0; int j = arr.length-1;
        while(i > j){
            sweptInArray(arr, i, j);
                i++;
                j--;
            }
        }

        void reverseInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray3(arr, 0, n-k-1);
        reverseArray3(arr, n-k, n-1);
        reverseArray3(arr, 0, n-1);
        }
    }

public class revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        reverse obj = new reverse();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value of k:");
        int k = sc.nextInt();

//        System.out.println("Before reversing, Array: " + Arrays.toString(arr));
//        arr = obj.reverseArray1(arr);
//        System.out.println("After reversing, Array: " + Arrays.toString(arr));
//        obj.reverseArray2(arr);
//        System.out.println("Reverse of Array 2 Method:"+ Arrays.toString(arr));
//        obj.reverseArray3(arr);
//        System.out.println("Reverse of Array 3 Method:"+ Arrays.toString(arr));
        obj.reverseInPlace(arr, k);
        System.out.println("print array after rotation "+ Arrays.toString(arr));

    }
}
