package OBJECT_ORIENTED_PROFGRAM;

import java.sql.SQLOutput;
import java.util.Scanner;

interface Calculator{
    int addition(int a, int b);
    int subtraction(int a, int b);
    int multiplication(int a, int b);
    int division(int a, int b);
}

class CalculatorApp implements Calculator {
    private int num1;
    private int num2;
    public CalculatorApp(){}
    public CalculatorApp(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int subtraction(int num1, int num2){
        return this.num1 - this.num2;
    }

    public int addition(int num1, int num2){
        return this.num1 + this.num2;
    }

    public int multiplication(int num1, int num2){
        return this.num1 * this.num2;
    }

    public int division(int num1, int num2){
        return num1/ num2;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1: ");
        int num1 = sc.nextInt();

        System.out.println("Number2: ");
        int num2 = sc.nextInt();
        CalculatorApp cal = new CalculatorApp();
        cal.setNum1(num1);
        cal.setNum2(num2);

        System.out.println(cal.addition(num1,num2));
        System.out.println("subtraction: "+cal.subtraction(num1,num2));
    }
}
