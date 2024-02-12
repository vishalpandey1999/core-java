package Java_OOPS_For_Inter;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $: " + amount);
        } else {
            System.out.println("Invalid deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $: " + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw Amount, Please enter a valid Amount");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double checkBalance() {
        System.out.println("Current Balance: $" + balance);
        return balance;
    }
}

class HolderAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter the Name of Account Holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount ba = new BankAccount(accountNumber, accountHolder, initialBalance);

        System.out.print("Enter Deposit Amount: "); // Prompt for deposit amount
        double depositAmount = sc.nextDouble();

        ba.deposit(depositAmount); // Deposit the entered amount
        ba.checkBalance();
    }
}
