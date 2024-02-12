package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;
class Question6{
    int MissingElement(int[] arr) {
        int n = arr.length;
        int ans = -1; // Initialize ans with a default value

        for (int i = 0; i < n - 2; i++) { // Changed the loop limit to n - 2
            if (arr[i] + 1 != arr[i + 1]) {
                ans = arr[i] + 1;
                break; // Found the missing element, no need to continue looping
            }
        }

        return ans;
    }

}

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question6 obj = new Question6();


        System.out.println("Print Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Print element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print Array: "+ Arrays.toString(arr));
        System.out.println("Print missing number: "+obj.MissingElement(arr));
    }
}
