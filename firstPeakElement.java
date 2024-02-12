package PWSkills;

import java.util.Scanner;

class PeakFirst{
    int firstPeak(int[] arr){
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                return i;
            }
        }
        return -1;
    }
}

public class firstPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeakFirst obj = new PeakFirst();

//        size
        System.out.println("enter size of element: ");
        int num = sc.nextInt();
        int [] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int peakIndex = obj.firstPeak(arr);

       if(obj.firstPeak(arr) != -1){
           System.out.println("The first peak element is "+arr[peakIndex]);
       } else{
           System.out.println("No peak index found in array");
       }
    }
}
