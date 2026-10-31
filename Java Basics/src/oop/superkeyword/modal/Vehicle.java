package oop.superkeyword.modal;

public class Vehicle {
    private int vehicleId;
    private String ownerName;
    public static String transportDepartment = "State Transport Department";

    Vehicle(int vehicleId, String ownerName)
    {
        this.vehicleId = vehicleId;
        this.ownerName = ownerName;
    }

    public void displayVehicleDetails()
    {
        System.out.println("Vehicle Id: " + this.vehicleId);
        System.out.println("Owner Name: " + this.ownerName);
    }
}
