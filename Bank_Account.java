package Chat_gpt_OOPS_Question;

public class Bank_Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public Bank_Account(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Balance $: "+balance);
        }else{
            System.out.println("This amount can not be deposit in account because the amount is invalid");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdraw Amount $ "+amount+" Now your balance "+balance);
        } else{
            System.out.println("Invalid Amount Enter Again...");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Check2{
    public static void main(String[] args) {
        Bank_Account ba = new Bank_Account("1234567","Vishal", 1234500);
        ba.deposit(1000);
        double balance = ba.getBalance();
        System.out.println(balance);
        ba.withdraw(5347);
    }
}
