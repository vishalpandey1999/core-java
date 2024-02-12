package Java_OOPS_For_Inter;

import java.util.Scanner;

public class Calculation {
    public double addition(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){
        if(num2 == 0){
            System.out.println("can not divide by zero");
            return Double.NaN;
        }
        return num1/num2;
    }
}

class CalculatorTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();

        System.out.print("Num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Num2: ");
        double num2 = sc.nextDouble();

        double ans = cal.addition(num1, num2);
        System.out.println("Print the sum: "+ans);
        System.out.println("Print the subst: "+cal.subtract(num1, num2));
        System.out.println("Print the multiplication: "+cal.multiplication(num1, num2));
        System.out.println("Print the division: "+cal.division(num1, num2));

    }
}
