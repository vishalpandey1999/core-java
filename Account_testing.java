package SuperPractice;

import java.util.ArrayList;

class Account{
    private String accountNumber;

    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("insufficient amount");
        }
    }

    public void withdraw(double amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
        }else{
            System.out.println("insufficient value can't withdraw........");
        }
    }

}

class Bank{
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void deposit(String userAccountNumber, double amount){
       for(Account account : accounts){
           if(userAccountNumber.equals(account.getAccountNumber())){
               account.deposit(amount);
               System.out.println("deposit successfully. ");
               return;
           }else{
               System.out.println("something wrong...., account not found......");
           }
       }
    }

    public void withdraw(String userAccountNumber, double amount){
        for(Account account : accounts){
            if(userAccountNumber.equals(account.getAccountNumber())){
                account.withdraw(amount);
                System.out.println("withdraw successfully.........");
            }else{
                System.out.println("Something wrong......... account not found......");
            }
        }
    }

    public void checkBalance(String userAccountNumber){
        for(Account account:accounts){
            if(userAccountNumber.equals(account.getAccountNumber())){
                System.out.println("Name:- "+account.getAccountHolder());
                System.out.println("Name:- "+account.getAccountNumber());
                System.out.println("Name:- "+account.getBalance());
                return;
            }
        }
        System.out.println("Account not found something wrong...........");
    }
}

public class Account_testing {
    public static void main(String[] args) {

        Account a1 = new Account("98765432","Vishal Pandey",5000.18);
        Account a2 = new Account("11765002","Rajesh Mishra",45000.35);
        Account a3 = new Account("30005432","Jagadish Mishra",15000.76);
        Account a4 = new Account("98765011","Ram Dubey",5361.63);
        Account a5 = new Account("98765000","Shyam shigh",2350023.80);

        Bank b1 = new Bank();
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        b1.addAccount(a4);
        b1.addAccount(a5);

//        b1.checkBalance("98765432");
//        b1.deposit("98765432",450087.88);
//        System.out.println("Print balance after deposit money into account");
//        b1.checkBalance("98765432");

        b1.checkBalance("qejnhdsgs");
    }
}
