package Week_9;

class Account{
    private String id;
    private String accountHolderName;
    private String address;
    private double balance;
    public Account(String id, String accountHolderName, String address, double balance){
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : "+amount);
        }else{
            System.out.println("Amount should grater than 0");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : "+amount);
        }else{
            System.out.println("Insufficient amount");
        }
    }
    public static double calculateSI(double principal, double rate, double time){
        return principal * rate * time / 100;
    }
    public static double calculateCI(double principal, double rate, double time){
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }

    public void display(){
        System.out.println("Account Id : "+id);
        System.out.println("Account Holder name : "+accountHolderName);
        System.out.println("Address : "+address);
        System.out.println("Balance : "+balance);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Account account = new Account("AC00099012", "Jane Alam", "Sidhari Azamgarh U.P.", 25034);
        account.display();
        account.deposit(5000);
        account.withdraw(2000);
        account.display();
        double SI = Account.calculateSI(2500, 12.5, 3);
        System.out.println("Simple Interest : "+SI);
        double CI = Account.calculateCI(2500, 12.5, 3);
        System.out.println("Compound Interest : "+CI);
    }
}
