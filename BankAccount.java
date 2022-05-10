public class BankAccount {
    private String name;
    private double balance;
    public double moneyDeposit;
    public double moneyWithdraw;

    // Class constructor
    public BankAccount (String accountHolder, double balance) {
        this.balance = balance;
        this.name = accountHolder;
    }

    public void deposit(double moneyDeposit){
        this.balance = balance + moneyDeposit;
    }

    public void withdrawal(double moneyWithdraw){
        this.balance = this.balance - moneyWithdraw;
    }

    public void printDetails() {
        System.out.println(this.name + " Account balance: " + this.balance);
    }

}