package basics.accessmodifier.com.address;

public class Address {
    private String address = "Unknown";
    protected String state = "Uttar Pradesh";
    public String getAddress(){
        return address;
    }
    int pincode = 1234;
    public int getPincode(){
        return pincode;
    }
    static void main(String[] args) {
        Address address = new Address();
        System.out.println(address.address);
    }

    protected Address(){
        System.out.println("Inside Address");
    }
}
