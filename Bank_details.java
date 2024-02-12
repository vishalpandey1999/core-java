package Core_Java;

import java.util.ArrayList;

class Account{
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid Deposit");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
        } else
            System.out.println("you can't withdraw this money, you entered invalid money ");
    }
}

class Bank {
    private ArrayList <Account> accounts;
    public Bank(){
        accounts = new ArrayList<Account>();
    }
    public void add_account(Account account){
        accounts.add(account);
    }
    public void remove_account(Account account){
        accounts.remove(account);
    }
    public void deposit_amount(Account account, double amount){
        account.deposit(amount);
    }
}

public class Bank_details {
}
