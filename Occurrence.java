package PWSkills;

import java.util.Scanner;
class repeating{
    int RepeatingValue(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;

            }
        }
        return count;
    }
}

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repeating obj = new repeating();

//        size
        System.out.println("Enter size : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value: ");
        int x = sc.nextInt();

        System.out.println("Repeating value: "+obj.RepeatingValue(arr, x));
    }
}
