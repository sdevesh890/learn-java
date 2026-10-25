package basics.classandobjects;


class Student{
    private int age;
    Student(){
        System.out.println("Student Default constructor");
    }
    private void getAge(){
        System.out.println(age);
    }
    Student(int age){
        this(); //this will invoke the non-parameterized constructor
        this.age = age; // this.age is pointing to current instance otherwise in functions local variable always get priority
        this.getAge(); // this keyword also used to invoke the current class method
    }
}
public class ThisDemo {
    static void main(String[] args) {
        Student student = new Student(12);
    }
}
