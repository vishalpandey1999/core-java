package LoveBabbar;

import java.util.Scanner;

class Uni{
    int uniqueElement(int[] arr){
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
}

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uni obj = new Uni();

        System.out.println("Enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("print array: ");
        System.out.println("unique: "+ obj.uniqueElement(arr));

    }
}
