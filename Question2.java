package OBJECT_ORIENTED_PROFGRAM;
interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
     void checkBalance(int accountNumber);

}
class Account implements Bank{

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Account Number:- "+accountNumber+" you have deposited "+amount+" now you balance is "+this.balance);
        }else{
            System.out.println("invalid something ");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("Account Number: "+ accountNumber+" your withdraw amount: "+amount+" now your balance: "+this.balance);
        }else{
            System.out.println("your amount is less then balance");
        }
    }
    public void checkBalance( int accountNumber){
        if(this.accountNumber == accountNumber){
            System.out.println("Account Number: "+ this.accountNumber
                                +" \nAccount Holder Name: "+ this.accountHolderName +
                                 "\n Balance: "+this.balance);
        }else{
            System.out.println("Invalid Account Number Enter Try again....");
        }
    }

}

public class Question2 {
    public static void main(String[] args) {
        Account a = new Account(123456,"Vishal Pandey",300000.00);
        Account b = new Account(100192,"Vikas singh",1500000.00);
        Account c = new Account(120056,"Vinay Thakur",5387009.30);
        Account d = new Account(129996,"Vijay Rana",7900450.09);
        Account e = new Account(120006,"Vimal sinha",3568000.55);

        a.deposit(50555);
        a.checkBalance(123456);
        a.withdraw(511);
        e.checkBalance(120006);
    }
}
