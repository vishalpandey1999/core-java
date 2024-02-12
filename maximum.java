package PWSkills;

import java.util.Arrays;
import java.util.Scanner;
class CheckValue{
    int maxValue(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    int findIndex(int[] arr, int x){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
                return index;
            }
        }
        return -1;
    }

    int Occurrence(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    int StrictlyGreaterThan(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(x < arr[i]){
                count++;
            }
        }
        return count;
    }

    int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int [] ans = { arr[0], arr[arr.length - 1]};
        return ans;
    }

    int[] secondSmallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int [] ans = { arr[1], arr[arr.length - 1 - 1]};
        return ans;
    }
}

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         CheckValue obj = new CheckValue();

        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("enter number: ");
//        int x = sc.nextInt();

//        System.out.println("Maximum number: "+obj.maxValue(arr));
//        System.out.println("find index: "+obj.findIndex(arr, x));

//        System.out.println("Occurrence of value: "+obj.Occurrence(arr,x));

//        System.out.println("last Occurrence of value: "+obj.lastOccurrence(arr,x));

//        if(obj.isSorted(arr)){
//            System.out.println("YES, This is sorted element");
//        } else{
//            System.out.println("NO, This is not sorted element");
//        }

//        System.out.println("Strictly greater than number: "+obj.StrictlyGreaterThan(arr, x));

        int[] ans = obj.secondSmallestAndLargestElement(arr);
        System.out.println(" second Smallest : "+ans[0]);
        System.out.println(" second largest : "+ans[1]);

    }
}
