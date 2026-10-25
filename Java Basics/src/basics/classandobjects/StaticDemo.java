package basics.classandobjects;


class Car{
    private String model;
    static String color; //this color belongs to class not the object of the class.

    void setModel(String model){
        this.model = model;
    }

    static{
        color = "Red";
        System.out.println("Car model must be Red");
    }

    static String getModel()
    {
//        this.model = "Unknown" -> non-static variable cannot be used inside the static block and method.
        return color;
    }

}
public class StaticDemo {
    static void main(String[] args) {
        Car ferrari = new Car();
        Car Bmw = new Car();
        ferrari.setModel("Series X");
        Bmw.setModel("S series");

        System.out.println(Car.color);
        Car.color = "Blue";
        System.out.println(Car.color);

    }
}
