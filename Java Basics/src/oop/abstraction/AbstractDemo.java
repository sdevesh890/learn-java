package oop.abstraction;


abstract class Animal{
    abstract void eat(); //If a method is abstract then class should be abstract too
    Animal(){
        System.out.println("Animal");
    }
    void sleep(){
        System.out.println("Animal Sleep");
    }
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
//        Animal a = new Animal(); cannot create object
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();
    }
}
