package PWSkills;

import java.util.Scanner;

class CheckIt{

    void evenNumber(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIt obj = new CheckIt();

        System.out.println("size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even number which is available in array: ");
        obj.evenNumber(arr);
    }
}
