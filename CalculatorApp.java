package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Calculator Menu: ");
                System.out.println("1. Addition(+) ");
                System.out.println("2. Subtraction(-) ");
                System.out.println("3. Multiplication(*) ");
                System.out.println("4. Division(/) ");
                System.out.println("5. Exit ");
                System.out.println("Select an operation (1-5): ");
                int choice = sc.nextInt();

                if(choice == 5){
                    System.out.println("Goodbye! ");
                    break;
                }
                System.out.println("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Enter Second number: ");
                double num2 = sc.nextDouble();

                switch (choice){
                    case 1:
                        System.out.println("Result: "+(num1+num2));
                        break;
                    case 2:
                        System.out.println("Result: "+(num1-num2));
                        break;
                    case 3:
                        System.out.println("Result: "+(num1*num2));
                        break;
                    case 4:
                        if(num2 == 0){
                            System.out.println("Not dividable num2 can not ne zero ");
                        }else{
                            System.out.println("Result: "+(num1/num2));
                        }
                        break;
                    default:
                        System.out.println("Invalid entry");
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                sc.next(); // Clear the invalid input
            }
        }
    }
}
