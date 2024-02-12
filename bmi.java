package MySelf;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight in kgs");
        float weight= sc.nextFloat();
        System.out.println("enter your height in meters squared");
        float height= sc.nextFloat();
        float BMI= (weight/height);
        System.out.println("BMI" + BMI);
    }
}
