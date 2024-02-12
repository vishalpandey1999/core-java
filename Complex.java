package OOPSforSetGet;

import java.util.Scanner;

public class Complex {
    private int num1;
    private int num2;

    public Complex(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum(){
        return num1 + num2;
    }

    public int getSubstitution(){
        return num1 - num2;
    }

    public int getProduct(){
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        Complex ans = new Complex(num1, num2);

        System.out.println("Sum of Two Number: "+ans.getSum());
        System.out.println("Subst-rec of Two Number: "+ans.getSubstitution());
        System.out.println("Product of Two Number: "+ans.getProduct());
    }
}
