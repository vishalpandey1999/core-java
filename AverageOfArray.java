package W3School;

import java.util.Scanner;
class Average{
    int arrayAverage(int[] arr){
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            avg = sum/(arr.length - 1);
        }
        return avg;
    }

}

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average obj = new Average();

//      size of Array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//      element of Array
        System.out.println("enter element of Array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average of Array element: "+obj.arrayAverage(arr));

    }
}
