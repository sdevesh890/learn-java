package oop.inheritance;

class Animal{
    int un_id;
    String skills;
    Animal(int un_id){
        this.un_id = un_id;
    }
    Animal(){
        System.out.println("Animal constructor");
    }
}

// Single Inheritance
class Dog extends Animal{
    // If parent class has args constructor - It is mandatory to use child constructor with super(args..) to pass the args to parent class. (If have non-args as well then no need)
    Dog(int un_id){
        super(un_id); // compulsory to use if only args given in parent class constructor
//        this.un_id = un_id; -> will work If non-args is there in parent class constructor
    }
    Dog(){
        System.out.println("Dog constructor");
    }
}
//Hierarchical Inheritance
class Cat extends Animal{
    Cat(int un_id){
        super(un_id);
    }
    Cat(){
        System.out.println("Cat constructor");
    }
}

//Multilevel Inheritance
class PitBull extends Dog{
    PitBull(int un_id){
        super(un_id);
    }
}
public class InheritanceType {
    static void main(String[] args) {
        Dog dog = new Dog(123);
        Cat cat = new Cat();
        PitBull pitBull = new PitBull(129);
        pitBull.skills = "Bite Force";
    }
}
