package Tap_Academy;

import java.util.Scanner;

//This is Armstrong Class, and it's named Armstrong Number
public class ArmstrongNumber {

//    This is a main class, And user writes all codes within the main class
    public static void main(String[] args) {

//        start code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number:- ");
        int num = sc.nextInt();

        int temp = num;
        int p = 0;

//        Function to calculate the sum individual digit
        while(num > 0){
            int rem = num % 10;
            p = (p) + (rem * rem * rem);
            num = num/10;
        }
        // Condition to check whether the value
        // of P equals to user input or not.
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }
}
