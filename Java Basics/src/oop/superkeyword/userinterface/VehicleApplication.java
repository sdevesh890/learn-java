package oop.superkeyword.userinterface;
import oop.superkeyword.modal.Vehicle;
import oop.superkeyword.modal.Bike;
public class VehicleApplication {
    static void main(String[] args) {
        System.out.println("Transport Department "+Vehicle.transportDepartment);

        Bike hunter = new Bike(101,"Devesh","Hunter 350");

        hunter.displayVehicleDetails();

    }
}
