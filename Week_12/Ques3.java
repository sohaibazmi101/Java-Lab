package Week_12;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Current balance: " + balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Attempted to withdraw: " + amount + " but only " + balance + " is available.");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". Current balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Account userAccount = new Account(1000);
        try {
            userAccount.deposit(500); 
            userAccount.withdraw(2000); 

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            userAccount.deposit(1000); 
            userAccount.withdraw(1500);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
