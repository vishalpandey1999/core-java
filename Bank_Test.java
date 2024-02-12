package W3School_OOPS.Bank_Of_Baroda;

public class Bank_Test {
    public static void main(String[] args) {
        BOB_Bank bank = new BOB_Bank();

        Accounts a1 = new Accounts("Vishal Pandey", "20221234", 2003456);
        Accounts a2 = new Accounts("Raj Pandey", "20001234", 100036);

        bank.addAccount(a1);
        bank.addAccount(a2);

        // Deposit example
        bank.deposits("20221234",5000);
        bank.displayAccountDetails("20221234");

        // Withdrawal example
        bank.withdraws("20001234", 3000);
        bank.displayAccountDetails("20001234");

        // Display all accounts
        bank.displayAllAccountDetails();
    }
}

