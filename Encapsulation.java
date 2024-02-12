package Core_Java;

import java.util.Scanner;

class BOBBankAccount{
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        BOBBankAccount bob = new BOBBankAccount();
        bob.setAccountNumber(accountNumber);
        bob.setBalance(balance);

        System.out.println("Account Number: "+bob.getAccountNumber());
        System.out.println("Balance: "+bob.getBalance());
    }
}
