package OOPSforSetGet;

import java.util.Scanner;

public class printAverageOfThree {
    private float num1;
    private float num2;
    private float num3;

    public printAverageOfThree(float num1, float num2, float num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public float getAverageOfThree(){
        return (num1 + num2 + num3)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        float first = sc.nextFloat();

        System.out.print("Enter second Number:");
        float second = sc.nextFloat();

        System.out.print("Enter first Number:");
        float third = sc.nextFloat();

        printAverageOfThree avg = new printAverageOfThree(first,second,third);
        System.out.println("Average of Three Number: "+avg.getAverageOfThree());
    }


}
