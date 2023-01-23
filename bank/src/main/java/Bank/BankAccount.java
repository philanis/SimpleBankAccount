package Bank;

public class BankAccount {
    private double balance;
    private String name;
    public void bankAcc(String name){
        this.name = name;
        //balance = 500.00;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return this.name;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(this.name + " has R" + balance);
    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println(name + " has R" + balance);
        }
        else {
            System.out.println("Withdrawal by " + this.name + " failed");
        }
    }
    public void transfer(double amount, BankAccount acc){
        if (this.balance < amount){
            System.out.println("Transfer fails");
        }
        else{
            balance -= amount;
            acc.balance =+ amount;
            System.out.println("Account of " + this.name + " becomes R" + acc.balance);
        }
    }
}
