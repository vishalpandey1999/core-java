package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class Find {
    int searchElement(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // Return the index if the element is found.
            }
        }
        return -1; // Return -1 if the element is not found.
    }
}

    public class findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Find obj = new Find();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target: ");
        int target = sc.nextInt();

        System.out.println("Print Array: "+ Arrays.toString(arr));
        System.out.println("Find Index of presenting number : "+obj.searchElement(arr, target));

    }
}
