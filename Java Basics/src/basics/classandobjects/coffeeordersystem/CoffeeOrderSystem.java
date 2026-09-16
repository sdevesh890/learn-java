package basics.classandobjects.coffeeordersystem;

public class CoffeeOrderSystem {

    private String customerName;
    private String coffeeType;
    private String cupSize;
    private double price;

    //Getter and Setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderMessage(){
        return "Order placed for "+this.customerName+":"+this.coffeeType;
    }

    static void main(String[] args) {
        CoffeeOrderSystem obj = new CoffeeOrderSystem();

        obj.setCustomerName("Rahul Sharma");
        obj.setCoffeeType("Cappuccino");
        obj.setCupSize("Medium");
        obj.setPrice(120.0);

        System.out.println(obj.getOrderMessage());
    }
}
