package SuperPractice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 3;
        int[] ans = new int[n];

        // Calculate the effective rotation by taking the modulo of k and n
        k = k % n;

        // Copy the last k elements to the beginning of the ans array
        for (int i = 0; i < k; i++) {
            ans[i] = arr[n - k + i];
        }

        // Copy the remaining elements to the end of the ans array
        for (int i = k; i < n; i++) {
            ans[i] = arr[i - k];
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}



