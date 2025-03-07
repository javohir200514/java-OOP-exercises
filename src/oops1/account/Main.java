package oops1.account;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(1,2000000);
        account.print();
        account.getMonthlyInterest();
        account.getMonthlyInterestRate();
        account.withdraw(5000);
        account.deposit(40000);
        System.out.println("\nNew balance:"+account.balance);
        

    }
}
