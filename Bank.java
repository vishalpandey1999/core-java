package Chat_gpt_OOPS_Question;

import java.util.Scanner;

class BankAccount{
    private static double balance;
    private String accountNumber;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Amount $ "+ amount + " into account "+ accountNumber);
        } else{
            System.out.println("Invalid Deposit amount. Amount must be greater then 0");
        }
    }

    public void withdraw(double amount){
        if(amount >= 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdraw Amount "+ amount + " from account "+accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid Withdraw amount. Withdraw amount must be greater then 0");
        } else{
            System.out.println("Insufficient balance. Cannot withdraw $\"" + amount);
        }
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+ balance);

    }

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        System.out.print("Withdraw amount : " );
        int withdraw = sc.nextInt();


        BankAccount ba = new BankAccount(accountNumber,amount);
        System.out.println(ba.getBalance());
        ba.deposit(amount);
        ba.withdraw(withdraw);
    }
}
