package Core_Java;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double addition(double num1, double num2){
        return num1 + num2;
    }

    public double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){
       if(num2 < 0){
           System.out.print("NOT divisible! num2 must be greater then zero, because divider should not be zero");
       }
      return num1/num2;
    }
}

class Calculator0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("NUMBER-1: ");
        double num1 = sc.nextDouble();

        System.out.println("NUMBER-2: ");
        double num2 = sc.nextDouble();

        Calculator cal = new Calculator(num1, num2);
        System.out.println(cal.addition(num1, num2));
        System.out.println(cal.subtraction(num1,num2));
        System.out.println(cal.multiplication(num1,num2));
        System.out.println(cal.division(num1,num2));
    }
}
