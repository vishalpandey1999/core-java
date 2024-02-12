//package W3School;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class problem{
//
////    printing array
//    void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//
////    for removing element
//    int RemoveElement(int[] arr, int x){
//        int len = arr.length;
//        int remove = 0;
//        for(int i = 0; i < len; i++){
//            for(int j = i + 1; j < len; j++){
//                if(arr[i] == arr[j]){
//                   remove = arr[i] - arr[j];
//
//                }
//
//            }
//            return remove;
//
//        }
//        return -1;
//    }
//}
//
//public class Remove {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        problem obj = new problem();
//
////        size
//        System.out.println("enter size: ");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//
////        element
//        System.out.println("enter element: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Print element before removing Array: ");
//       Arrays.toString(arr);
//       obj.printArray(arr);
//
////        enter element which element user want to delete
//        System.out.println("enter element which you want for delete from Array: ");
//        int x = sc.nextInt();
//
//        System.out.println("after removing element: "+obj.RemoveElement(arr, x));
//        Arrays.toString(arr);
//
//        obj.printArray(arr);
//    }
//}



//not clear