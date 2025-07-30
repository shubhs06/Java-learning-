package shubhu.BankManagement;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private long balence;

    BankAccount(long accountNumber,String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public long Withdraw(long money){
        if (balence < money) {
           System.out.printf("You don't have Sufficient Balence \nyour Balance is : %d\n", balence);
        } else if(money > 20000l || money <= 0){
            System.out.println("Withdrawle Faild ");
        } else {
            balence -= money;
            System.out.printf("you withdraw %d , your current Balance is : %d%n", money,balence);
        }
        return money;  
    }
    public void Deposit(long money){
        if (money <= 0) {
            System.out.println("invalid Deposit");
        } else{
            balence += money;
        }
        

    }
}
