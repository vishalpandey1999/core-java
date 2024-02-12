package Tap_Academy;

import java.util.Arrays;
import java.util.Scanner;
class find{
    void leader(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean isLeader = true;
            for(int j = i + 1; j < n; j++){
                if(arr[j] >= arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader == true){
                System.out.println(arr[i]);
            }
        }
    }

    void leaderIs(int[] arr){
        int n = arr.length - 1;
        for(int i = n; i >= 0; i--){
            
        }
    }
}

public class findLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        find obj = new find();

        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
        obj.leader(arr);
    }
}
