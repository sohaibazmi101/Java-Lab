package Week_11;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    static void aboutBank() {
        System.out.println("This is a bank that provides Saving and Current account services.");
    }
    default void takeLoan(double amount) {
        System.out.println("Loan service is not available for this account type.");
    }
}

class Saving implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Saving account. Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Saving account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Saving account.");
        }
    }
    @Override
    public void takeLoan(double amount) {
        System.out.println("Loan of " + amount + " has been approved for Saving account.");
    }
}

class Current implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current account. Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current account.");
        }
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Account.aboutBank();
        Saving savingAccount = new Saving();
        Current currentAccount = new Current();
        savingAccount.deposit(1000);
        savingAccount.withdraw(500);
        currentAccount.deposit(1500);
        currentAccount.withdraw(700);
        currentAccount.takeLoan(1000);
        savingAccount.takeLoan(5000);
    }
}
