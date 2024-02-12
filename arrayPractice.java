package W3School;

import java.util.Arrays;
import java.util.Scanner;

class Array{




    //    take input from user in numerical
    void takeInputNumerical(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

//    print output in numerical
    void printNumericalArray(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }

//    take input in string
    void takeInputString(String[] arr_2){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr_2.length; i++){
            arr_2[i] = sc.nextLine();
        }
    }

//    print output in string type
    void printString(String[] arr_2){
        for(int i = 0; i < arr_2.length; i++){
            System.out.println(Arrays.toString(arr_2));
        }
    }

}

public class arrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array obj = new Array();

//        declare size of array in numerical format

//        System.out.println("enter size of array: ");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//
//        System.out.println("take numerical input from user: ");
//        obj.takeInputNumerical(arr);
//        System.out.println("print numerical output before sorting : "+Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("print numerical output after sorting :"+Arrays.toString(arr));


//        now process for string
        System.out.println("enter string size of Array: ");
        int num = sc.nextInt();
        String[] arr = new String[num];

//        take input from user
        obj.takeInputString(arr);

//        print string Array
        System.out.println("print string before sorting: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("print string after sorting: "+ Arrays.toString(arr));


    }
}
