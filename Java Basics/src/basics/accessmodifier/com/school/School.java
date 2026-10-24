package basics.accessmodifier.com.school;

import basics.accessmodifier.com.address.Address;
import basics.accessmodifier.com.address.Address1;

class GayatriSchool extends Address{
     String name;
     private int phone;
     Address address;

     public String getAddress(){
         return state;
     }
}
public class School extends Address1{
    static void main(String[] args) {
         GayatriSchool school = new GayatriSchool();
         school.name="Gayatri";
//        school.address.address = "Agra"; compile time error since address is the instance variable but private so cannot access
        System.out.println(school.address.getPincode()); // variable pincode- Not accessible outside the package

        Address1 address1 = new Address1();

    }
}
