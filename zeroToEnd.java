package Tap_Academy;

import java.util.Arrays;
import java.util.Scanner;
class click{
    void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    void ZeroInSide(int [] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        if(n == 0 || n == 1){
            return;
        }
        while(left < right){
            if(arr[left] == 0 && arr[right] > 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] > 0){
                left++;
            }
            if(arr[right] == 0){
                right--;
            }

        }
    }

    void moveZero(int [] arr){
        int size = arr.length;
        if(size == 0 || size == 1){
            return;
        }
       int nz = 0, z = 0;
        while(nz < size){
            if(arr[nz] != 0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else{
                nz++;
            }
        }
    }
}

public class zeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        click obj = new click();

        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("print Array: "+ Arrays.toString(arr));
        obj.moveZero(arr);
        System.out.println("Zero into the end of The Array: "+ Arrays.toString(arr));


    }
}
