package W3School;

import java.util.Scanner;

public class printingGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of row: ");
        int row = sc.nextInt();

        System.out.println("enter size of column: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
