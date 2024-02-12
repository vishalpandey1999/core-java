package W3School;

import java.util.Scanner;

class Find{

    boolean findArray(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
}

public class findValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Find obj = new Find();

//        size
        System.out.println("enter size of element: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        declare value which is user found
        System.out.println("enter value: ");
        int x = sc.nextInt();

        if(obj.findArray(arr, x)){
            System.out.println("Yes this number is available in the array: "+ x);
        } else{
            System.out.println("No this number is not available in the array: "+ x);
        }

    }
}
