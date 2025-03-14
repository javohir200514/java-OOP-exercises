package exercises_2.exercises_2_5;

public class Account  {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id,Customer customer, double balance) {
        this.id=id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id=id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName(){

        return customer.getName();
    }

    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance>=amount) {
            this.balance -= amount;
        }else{
            System.err.printf("amount withdrawn exceeds the current balance");
        }
        return this;
    }

    @Override
    public String toString() {
        return customer.toString() +
                " balance=" +  balance;
    }
}
