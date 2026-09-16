package basics.classandobjects;

// You can have multiple non-public classes
class Account{
   int balance = 5000;
   private String address;

   public String getAddress(){
       return address;
   }

   public void setAddress(String address)
   {
       this.address = address;
   }
}
public class ObjectDemo {
    static void main(String[] args) {
        // Objects are used to access the properties of the class
        Account account = new Account();
        System.out.println(account.balance);
        account.setAddress("Infotech Park");
        //If you access property that doesn't hold any value- NUll
        System.out.println(account.getAddress());

    }
}
