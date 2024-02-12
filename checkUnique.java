package PWSkills;

import java.util.Arrays;
import java.util.Scanner;


class CheckNow{
    int Unique(int[] arr){
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
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    int[] secondLargestNumber(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[arr.length - 2]};
        return ans;
    }

    int secondLargest(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
}

public class checkUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckNow obj = new CheckNow();

//        print size of Array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        print element from array
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("through output as unique number: "+obj.Unique(arr));

        System.out.println("second largest number of Array: "+ Arrays.toString(obj.secondLargestNumber(arr)));
        System.out.println("second largest number of Array By using new method: "+ Arrays.toString(obj.secondLargestNumber(arr)));
    }
}
