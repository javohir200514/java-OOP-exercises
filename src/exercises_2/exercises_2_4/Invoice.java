package exercises_2.exercises_2_4;

public class Invoice  {
    private int id;
    private Customer costumer;
    private double amount;

    public Invoice(int id,  Customer customer, double amount) {
        this.id=id;
        this.costumer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {

        return costumer;
    }

    public void setCustomer(Customer costumer) {

        this.costumer = costumer;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public int getCustomerId(){

        return costumer.getId();
    }
    public String getCustomerName(){

        return costumer.getName();
    }

    public double getCustomerDiscount(){

        return costumer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount-amount*costumer.getDiscount()/100.0;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + getId()+",costumer="+costumer +costumer.toString()+
                ", amount=" + amount +
                ']';
    }
}
