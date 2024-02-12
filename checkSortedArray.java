package SuperPractice;

import java.util.Arrays;
import java.util.Scanner;
class Question{
    boolean checkSorted(int [] arr){
        int n = arr.length;
        boolean check = true;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] > arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }

    int[] MaxMinValue(int [] arr){
        int min = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return new int[]{min, mx};
    }

    int totalNumberOfPair(int[] arr, int sum){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }

    int totalNumberOfThreePair(int[] arr, int sum){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    int findUnique(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    int LargestNumber(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }

        return mx;
    }
    int findSecondLargest(int[] arr){
        int mx = LargestNumber(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return LargestNumber(arr);
    }

    int firstRepeatingValue(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    int[] reverseArray_1(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n - 1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    void reverseArray_2(int [] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    void sortZeroAndOne(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 0){
                right--;
            }
        }
    }

}

public class checkSortedArray {
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
//        System.out.println("enter target: ");
//        int target = sc.nextInt();

//        int [] ans = obj.reverseArray_1(arr);
//
//        System.out.println("Reverse Array by first method: "+ Arrays.toString(ans));
//        obj.reverseArray_2(arr);
        obj.sortZeroAndOne(arr);
        System.out.println("Reverse Array by second method: "+ Arrays.toString(arr));
    }
}
