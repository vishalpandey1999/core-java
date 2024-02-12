package W3School;

import java.util.Scanner;

class QuestionArray{

    int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        enter size of Array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];



    }
}
