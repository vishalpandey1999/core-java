package PWSkills;

import java.util.Arrays;
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        size
        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int minElement = Arrays.stream(arr).min().getAsInt();

        System.out.println("Minimum element in array: "+minElement);
    }
}
