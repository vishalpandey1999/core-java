package Exception_Handling;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueConverting = true;
        while (continueConverting){
            try{
                System.out.println("Temperature Converter Menu: ");
                System.out.println("1. Convert Fahrenheit to Celsius ");
                System.out.println("2.Convert Celsius to Fahrenheit ");
                System.out.println("3. Exit ");
                System.out.println("Select an option (1 - 3): ");
                int choice = sc.nextInt();
                if(choice == 3){
                    System.out.println("Exiting the temperature converter.");
                    continueConverting = false;
                } else if (choice == 1 || choice == 2) {
                    System.out.println("Enter Temperature: ");
                    double temperature = sc.nextDouble();
                    double convertedTemperature;

                    if(choice == 1){
                        convertedTemperature = (temperature - 32) * 5/9;
                        System.out.println("Result: "+convertedTemperature);
                    }else{
                        convertedTemperature = (temperature - 1.8) +32;
                        System.out.println("Result: "+convertedTemperature);
                    }
                }else{
                    System.out.println("Invalid choice please enter 1, 2 or 3");
                }
            }catch(Exception e){
                System.out.println("Invalid input please enter valid Input ");
                System.out.println("Error "+e.getMessage());
                sc.nextLine();
            }
        }
    }
}
