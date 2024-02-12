package Exception_Handling;

import java.util.Scanner;

public class OddNumberException {
    public static void evenNumber(int num){
        if(num % 2 != 0){
            throw new ArithmeticException("Not allow because This number is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            evenNumber(num);
            System.out.println("Number is "+num);
        }catch (ArithmeticException e){
            System.out.print("Error !"+e.getMessage());
        }
    }
}
