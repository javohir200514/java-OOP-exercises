package exercises_2.exercises_2_5;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "John Doe", 'm');
        System.out.println(c1); // Customer sinfini tekshiramiz

        Account acc1 = new Account(1001, c1, 500.0);
        System.out.println(acc1); // Account toString()

        acc1.deposit(200);
        System.out.println("After deposit: " + acc1);

        acc1.withdraw(150);
        System.out.println("After withdraw: " + acc1);

        acc1.withdraw(1000); // Not enough balance!

        System.out.println("Account ID: " + acc1.getId());
        System.out.println("Customer Info: " + acc1.getCustomer());
        System.out.println("Balance: " + acc1.getBalance());
    }
}
