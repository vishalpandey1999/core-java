package PWSkills;

import java.util.Arrays;
import java.util.Scanner;

class impact{

    void swapInArray(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverseArray(int[] arr){
        int i = 0, j = arr.length - 1;

        while(i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
}

public class lecture17_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        impact obj = new impact();

        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before reversing: "+ Arrays.toString(arr));
        obj.reverseArray(arr);
        System.out.println("Array after swapping "+ Arrays.toString(arr));
    }
}
