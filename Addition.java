//package W3School;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class AddArray{
//    int sumOfArray(int[] arr){
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
//
//     void grid(int[] arr, int r, int c){
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                System.out.println(arr[j]);
//            }
//        }
//    }
//
//    int avg(int[] arr){
//        int sum = 0;
//        int avg = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//            avg = sum/(arr.length - 1);
//        }
//        return avg;
//    }
//
//    int specialValue(int[] arr, int x){
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == x){
//                return x;
//            }
//        }
//        return -1;
//    }
//
//    int findIndex(int[] arr, int x){
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == x){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    int RemoveIndex(int[] arr, int remove){
//        for(int i = remove; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//
//
//            return arr[i];
//        }
//    }
//}
//
//public class Addition {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////  Write a Java program to copy an array by iterating the array.
////        size
//        System.out.println("enter size of Array:");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//
//        System.out.println("enter element: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
////        Write a Java program to find the maximum and minimum value of an array.
//
////        System.out.println("print value: "+ Arrays.toString(arr));
////        Arrays.sort(arr);
////        System.out.println("smallest element of Array: "+arr[0]);
////        System.out.println("largest element of Array: "+arr[arr.length - 1]);
//
//        System.out.println("enter which index you want to remove: ");
//        int remove = sc.nextInt();
//
//        AddArray obj = new AddArray();
//        System.out.println("before removing index: "+Arrays.toString(arr));
//        obj.RemoveIndex(arr, remove);
//        System.out.println("After removing index: "+Arrays.toString(arr));
//    }
//
//}
