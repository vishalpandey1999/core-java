package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class Pairs{
    int SumOfPair(int[] arr,int x){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == x){
                    count++;
                }
            }
        }
        return count;
    }

    int sumOfTriple(int[] arr, int x){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

}

public class numberOfPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pairs obj = new Pairs();


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
        System.out.println("smallest and largest array: "+ obj.sumOfTriple(arr,target));

    }
}
