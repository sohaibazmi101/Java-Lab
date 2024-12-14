package Week_9;

abstract class Account {
    protected String id;
    protected String accountHolderName;
    protected String address;

    public Account(String id, String accountHolderName, String address) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class Saving extends Account {
    private double minBalance;
    private double balance;

    public Saving(String id, String accountHolderName, String address, double minBalance) {
        super(id, accountHolderName, address);
        this.minBalance = minBalance;
        this.balance = minBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void display() {
        System.out.println("Saving Account ID : " + id);
        System.out.println("Name : " + accountHolderName);
        System.out.println("Address : " + address);
        System.out.println("Balance : " + balance);
    }
}

class Current extends Account{
    private double maxWithdrawalLimit;
    private double balance;
    public Current(String id, String accountHolderName, String address, double maxWithdrawalLimit){
        super(id, accountHolderName, address);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : "+amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= maxWithdrawalLimit && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal : "+amount);
        }else{
            System.out.println("Insufficent Amount");
        }
    }
    public void display(){
        System.out.println("Current Id : "+id);
        System.out.println("Name : "+accountHolderName);
        System.out.println("Address : "+address);
        System.out.println("Balance : "+balance);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Saving saving = new Saving("AC00990012", "Mohd Sohaib", "Amilo Azamgarh", 37210);
        saving.deposit(12000);
        saving.withdraw(8000);
        saving.display();

        Current current = new Current("AC00991290", "Kamla Devi", "sadatpura Mau", 2000);
        current.deposit(12000);
        current.withdraw(800);
        current.display();
    }
}
