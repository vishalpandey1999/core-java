package PWSkills;

import java.util.Arrays;
import java.util.Scanner;

class Array4{

    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    int[] reverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    int[] rotation(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

//        first iteration
        for(int i = n - k; i < n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n - k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
}

public class lectureNo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array4 obj = new Array4();

        System.out.println("enter size :");
        int num = sc.nextInt();
        int [] arr = new int[num];

        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter k:");
        int k = sc.nextInt();

        System.out.println("print array before rotation: "+Arrays.toString(arr));

        System.out.println("print array before rotation: "+ Arrays.toString(obj.rotation(arr, k)));




    }
}
