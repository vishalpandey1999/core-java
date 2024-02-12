package PWSkills;

import java.util.Scanner;

class PositiveInt{

    void findPositive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveInt obj = new PositiveInt();

//        size
        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("positive array: ");

        obj.findPositive(arr);
    }
}
