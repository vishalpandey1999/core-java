package W3School_OOPS.Bank_Of_Baroda;

import java.util.ArrayList;
import java.util.List;

public class BOB_Bank {
    private  List<Accounts> accountList;

    public BOB_Bank() {
        accountList = new ArrayList<>();
    }

    public void addAccount(Accounts account){
        accountList.add(account);
    }

    public void deposits(String accountNumber, double amount){
        for(Accounts account1 : accountList){
            if(account1.getAccountNumber().equals(accountNumber)){
                account1.depositMoney(amount, accountNumber);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraws(String accountNumber, double amount){
        for(Accounts account1 : accountList){
            if(account1.getAccountNumber().equals(accountNumber)){
                account1.withdrawMoney(amount,accountNumber);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccountDetails(String accountNumber){
        for(Accounts account1 : accountList){
            if(account1.getAccountNumber().equals(accountNumber)){
                account1.accountDetails();
                return;
            }
        }
        System.out.println("Account Not found.");
    }

    public void displayAllAccountDetails(){
        System.out.println("All Account Details: ");
        for(Accounts account1 : accountList){
            account1.accountDetails();
            System.out.println("----------------");
        }
    }
}
