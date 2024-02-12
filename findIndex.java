package W3School;

import java.util.Scanner;

class Index{

    int findArrayIndex(int[] arr, int x){
        if(arr == null) return -1;
        int len = arr.length;
        int i = 0;

        while( i < len){
            if(arr[i] == x) return i;
            else i = i + 1;
        }
        return -1;
    }

}

public class findIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Index obj = new Index();

//        size
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        enter element which  you find
        System.out.println("enter value: ");
        int x = sc.nextInt();

//        find index
        System.out.println("index is "+obj.findArrayIndex(arr, x));

    }
}
