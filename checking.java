package MySelf;

import java.util.Arrays;
import java.util.Scanner;
class CheckMySelf{
    int largest(int[] arr){
        int n = arr.length;
        int mx = 0;
        for(int i = 0; i < n; i++){
            if(mx < arr[i]){
                mx = arr[i];
            }
        }
        return mx;
    }
}

public class checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckMySelf obj = new CheckMySelf();


        System.out.println("enter size : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("print element: "+ Arrays.toString(arr));

        System.out.println("print largest :"+ obj.largest(arr));

    }
}
