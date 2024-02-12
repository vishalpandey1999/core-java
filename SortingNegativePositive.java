package LoveBabbar;

import java.util.Arrays;
import java.util.Scanner;
class Question{
    int[] SortingNumbers(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                ans[k++] = arr[i];

            }
        }
            for(int i = 0; i < n; i++ ){
            if(arr[i] < 0) {
                ans[k++] = arr[i];
            }
        }
        return ans;
    }

    int[ ] SortingNumber(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int a = 0, b = 0, c = 0;
        int k = 0;

//        iteration
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                a++;
            } else if (arr[i] == 1) {
                b++;
            } else {
                c++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i < a){
                ans[k++] = 0;
            } else if (i < a + b) {
                ans[k++] = 1;
            }
                 else {
                ans[k++] = 2;
            }
        }
        return ans;
    }
    void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void Sorting(int [] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left < right){
            if(arr[left] < 0 && arr[right] > 0){
                swap(arr, left, right);
            }
            if(arr[left] > 0){
                left++;
            }
            if(arr[right] < 0){
                right--;
            }
        }
    }
}

public class SortingNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question obj = new Question();

        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print Array: "+ Arrays.toString(arr));
//        int[] ans = obj.SortingNumbers(arr);
        obj.Sorting(arr);
        System.out.println("Sorting Arrays: "+Arrays.toString(arr));
    }
}
