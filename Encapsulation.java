class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance; 
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount depositted successfully .... ");
        } else {
            System.out.println("Amount is invalid  .... ");
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Amount to withdraw exceeded your balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawed successfully .... ");
        }
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", 1000000.00);
        System.out.println(account.getBalance());
        account.withdraw(10000);
        System.out.println(account.getBalance());
        account.deposit(5000);
        System.out.println("After deposit: " + account.getBalance());
    }
}
