package LoveBabbar;

import java.util.Scanner;
class sec{
    int maximum(int[] arr){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    int SecondMax(int[] arr){
        int max = maximum(arr);
        for(int i= 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMx = maximum(arr);
        return secondMx;
    }

}

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sec obj = new sec();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("print array: ");
        System.out.println("second maximum: "+ obj.SecondMax(arr));

    }
}
