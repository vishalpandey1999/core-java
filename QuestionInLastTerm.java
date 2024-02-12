package SuperPractice;

import java.util.Arrays;
import java.util.Scanner;
class SuperQuestion {
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    int maximumValue(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }



    int searchGivenArray(int [] arr, int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
               return i;
            }
        }
        return -1;
    }

    int Occurrence(int[] arr, int x){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    int lastOccurrence(int [] arr, int x){
        int n = arr.length;
        int lastIndex = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    int StrictlyGreaterThan(int[] arr, int x){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > x){
                return arr[i];
            }
        }
        return -1;
    }

}

public class QuestionInLastTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuperQuestion obj = new SuperQuestion();

        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        obj.printArray(arr);
        System.out.println(obj.StrictlyGreaterThan(arr, x));

    }
}