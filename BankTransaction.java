public class BankTransaction {
    String accountName;
    String accountHolderName;
    String accountType;
    int accountNumber;
    double balance;

    public BankTransaction(String accName, String holderName, String accType, int accNo, double bal) {
        accountName = accName;
        accountHolderName = holderName;
        accountType = accType;
        accountNumber = accNo;
        balance = bal;
    }

    public void show() {
        System.out.println("Transaction Details:");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
    public static void main(String[] args) {
        Bank_customer c1 = new Bank_customer("Dom", 202, "LXR");
        c1.display();

        BankTransaction t1 = new BankTransaction("SBI", "Chumni", "Savings", 3284, 10000000.00);
        t1.show();
    }
}