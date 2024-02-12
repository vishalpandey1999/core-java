package PWSkills;

import java.util.Scanner;

class first{
    int FirstRepeating(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

public class firstValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        first obj = new first();

//        size
        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("first repeating number: "+obj.FirstRepeating(arr));
    }
}
