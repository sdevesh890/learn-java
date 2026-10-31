package oop.superkeyword.modal;

public class Bike extends Vehicle {
    private String bikeModal;

    public Bike(int vehicleId, String ownerName,String bikeModal) {
        super(vehicleId, ownerName); //Invoke the immediate parent class constructor- should alwys written in first line.
        this.bikeModal = bikeModal;
    }
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); //Invoke the parent class method
        System.out.println("BikeModal: " + this.bikeModal);
    }
}
