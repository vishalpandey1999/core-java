package PWSkills;

import java.util.Arrays;
import java.util.Scanner;

class Rotation{

    int[] rotate(int [] arr, int k){
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
}

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rotation obj = new Rotation();

//        enter size of Array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        enter element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("print array before rotating: "+ Arrays.toString(arr));
//        enter element on which place user want to rotation
        System.out.println("enter rotation place:");
        int k = sc.nextInt();
        int[] ans = obj.rotate(arr, k);
        System.out.println("After rotation: "+ Arrays.toString(ans));
    }
}
