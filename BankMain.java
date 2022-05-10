public class BankMain {
    public static void main(String[] args) {
    
    // Initially start with 500 dollars then deposit 100 dollars = 600 dollars
    BankAccount user1 = new BankAccount("Twiggy", 500);
    
    user1.deposit(100);
    user1.printDetails();
    
    // Second part. Larry starts with 5000 dollars and withdraws 100 dollars. Mary start with 300 dollars and deposits 100 dollars.
    BankAccount user2 = new BankAccount ("Larry", 5000);
    BankAccount user3 = new BankAccount("Mary", 300);

    user2.withdrawal(100);
    user3.deposit(100);

    user2.printDetails();
    user3.printDetails();

    }
}
