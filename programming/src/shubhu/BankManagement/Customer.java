package shubhu.BankManagement;

public class Customer {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(25413, "Shubham");
        account1.Deposit(20000);
        account1.Withdraw(21000);
        account1.Withdraw(200);
        account1.Withdraw(-200);
        account1.Deposit(-2221);
        account1.Withdraw(5400);


    }
}
