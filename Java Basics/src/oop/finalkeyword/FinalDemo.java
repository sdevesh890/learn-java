package oop.finalkeyword;


class Employee{
    public final void display(){
        System.out.println("Employee display");
    }
}
final class User{ //cannot be extended.

}
public class FinalDemo extends Employee {
    //Final Variable - cannot be reassigned
    final int num;
//    num = 34; ->  get compile time error

    FinalDemo(int num) {
        this.num = num; // can be initialized via constructor
    }

//    @Override -> can not be overridden.
//    public final void display(){
//        System.out.println("Employee display");
//    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo(23);
        System.out.println(fd.num);
    }
}
