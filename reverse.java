package PWSkills;

import java.util.Scanner;

class reverseOrder{
    int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

//        traverse original array in reverse order

        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
}

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseOrder obj = new reverseOrder();

//        Size
        System.out.println("enter size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

//        element
        System.out.println("enter element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = obj.reverseArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }

    }
}
