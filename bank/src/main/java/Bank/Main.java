package Bank;

public class Main {

    public static void main(String[] args){
        BankAccount tom = new BankAccount();
        tom.bankAcc("Tom");
        tom.deposit(500.00);
        tom.getBalance();


        BankAccount sandy = new BankAccount();
        sandy.bankAcc("Sandy");
        sandy.deposit(200.00);
        sandy.getBalance();


        tom.getBalance();
        tom.transfer(100.00, sandy);


        sandy.withdraw(50.00);
        sandy.withdraw(700.00);

    }
}
