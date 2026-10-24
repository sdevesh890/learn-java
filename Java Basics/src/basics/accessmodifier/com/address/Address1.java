package basics.accessmodifier.com.address;

public class Address1 {
    Address address;
    public  Address1(){
        System.out.println("Inside Address1");
    }
    static void main(String[] args) {
        Address1 address1 = new Address1();
        address1.address = new Address();
        address1.address.pincode = 12334;
        System.out.println(address1.address.pincode);

        System.out.println(address1.address.state); // Protected can only be use by Inheritance


    }
}
