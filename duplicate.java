package PWSkills;

import java.util.Arrays;
import java.util.Scanner;

class checkNumber1{
    int duplicateNumber(int [] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j] && (i  != j)){
                    return arr[j];
                }
            }
        }
        return -1;
    }
}

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkNumber1 obj = new checkNumber1();
        System.out.println("enter size of Array:");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println(obj.duplicateNumber(arr));

    }
}
