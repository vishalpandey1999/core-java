package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;
class  Question7{
    int FirstRepeatingValue(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 1; i < n - 1; i++){
            for(int j = i + 2; j < n - 1; j++){
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        return -1;
    }
}

public class repeatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question7 obj = new Question7();

        System.out.println("Print Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Print element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print Array: "+ Arrays.toString(arr));
        System.out.println("Print first repeating  number: "+obj.FirstRepeatingValue(arr));
    }
}
