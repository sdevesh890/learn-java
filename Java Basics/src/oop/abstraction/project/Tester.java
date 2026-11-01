package oop.abstraction.project;


abstract class RRPaymentServices{
    private double balance;
    private int customerId;

    RRPaymentServices(double balance, int customerId){
        this.balance = balance;
        this.customerId = customerId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getCustomerId() {
        return customerId;
    }
    public abstract void payBill(double amount);
}

class  ShoppingPayment extends RRPaymentServices{
    private static int counter = 1001;
    private String paymentId;

    ShoppingPayment(double balance, int customerId){
        super(balance, customerId);
    }

    @Override
    public void payBill(double amount) {
         if(amount > getBalance()){
             System.out.println("Excess amount entered!! Please try again.");
             return;
         }else if(amount < getBalance()){
             System.out.println("Insufficient amount entered!! Please try again.");
             return;
         }
        System.out.println("Congratulations!! Your payment of Rs."+ amount + "is successful with payment id ."+getPaymentId());
         counter++;
    }

    public String getPaymentId() {
        return 'S'+paymentId;
    }
}

class CreditCardPayment extends RRPaymentServices{
    public static int counter = 1001;
    private String paymentId;
    private double cashBack;
    private double balanceDue;

    CreditCardPayment(double balance, int customerId){
        super(balance, customerId);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    @Override
    public void payBill(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount entered!! Please try again.");
            return;
        }

        double previousDue = getBalance();
        balanceDue = Math.max(previousDue - amount, 0);
        if (amount > previousDue) {
            cashBack += amount - previousDue;
        }

        paymentId = "C" + counter++;
        setBalance(balanceDue);

        System.out.println("Congratulations!! You have successfully made a payment of Rs."
                + amount + ". Payment details are:");
        System.out.println("**********************************************************************************");
        System.out.println("Customer ID : " + getCustomerId());
        System.out.println("Payment ID : " + getPaymentId());
        System.out.println("Previous Due: Rs." + previousDue);
        System.out.println("Remaining Due: Rs." + (balanceDue == 0 ? "0" : balanceDue));
        System.out.println("Cashback wallet Balance : Rs." + (cashBack == 0 ? "0" : cashBack));

    }
}
public class Tester {
    static void main(String[] args) {
        RRPaymentServices payment = new CreditCardPayment(10000.23,5001);

        payment.payBill(5000.0);

    }
}
