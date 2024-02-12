package W3School_OOPS.Bank_Of_Baroda;

public class Accounts {
    private String accountHolder;
    private String accountNumber;
    private  double balance;

    public Accounts(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public  double getBalance() {
        return balance;
    }

    public void depositMoney(double amount, String an)  {
        if(accountNumber.equals(an) && amount > 0){
            balance += amount;
        } else if (!accountNumber.equals(an)) {
            System.out.println("Your Account Number is wrong please try again...");
        } else if (amount <=0) {
            System.out.println("you can not deposit zero amount or less then zero amount");
        } else{
            System.out.println("Server down,Please wait.....\n otherwise Try again....");
        }
    }

    public void withdrawMoney(double amount, String an) {
        if (accountNumber.equals(an) && amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Account Number: " + accountNumber + "\n Account Holder: " + accountHolder + "\n Balance: " + balance);
        } else if (!accountNumber.equals(an)) {
            System.out.println("Your Account Number is wrong please try again...");
        } else if (balance < amount) {
            System.out.println("Exceeds your minimum deposit amount. Please check and try again.");
        } else {
            System.out.println("Server down,Please wait.....\n otherwise Try again....");
        }
    }


    public void checkBalance(String an){
        if(accountNumber.equals(an)){
            System.out.println("Your Name: "+accountHolder+"\n+ Account Number :"
                    +accountNumber+"\n Balance: "+balance);
        }else{
            System.out.println("You enter wrong account number try again");
        }
    }

    public void accountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Holder: " + accountHolder +
                "\nBalance: " + balance;
    }
}
