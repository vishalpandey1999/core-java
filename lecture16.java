package PWSkills;

import java.util.Scanner;
class Find1{
    int pairSum(int[] arr, int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        return ans;
    }

    int tripletSum(int[] arr, int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

}

public class lecture16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Find1 obj = new Find1();

//        declare size of array
        System.out.println("enter size of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        enter element
        System.out.println("enter element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter you target: ");
        int x = sc.nextInt();

//        find the total number of pair in the array where sum is equal to the given value x
//        System.out.println("counting of pairing sum "+obj.pairSum(arr, x));
        System.out.println("counting of pairing sum "+obj.tripletSum(arr, x));

    }
}
