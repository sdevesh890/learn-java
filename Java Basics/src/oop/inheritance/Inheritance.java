package oop.inheritance;

class Employee{
    int empId;
    int basicSalary = 15000;

    //execute - 3
    Employee(){
        System.out.println("Employee constructor");
    }

    // execute - 1
    static{
        System.out.println("Employee static");
    }

    int getEmpId(){
        return empId;
    }

    void setEmpId(int empId)
    {
        this.empId = empId;
    }
}

class PermanentEmployee extends Employee{
    int salary;
    int hra = 3000;
    int da = 1500;

    //execute - 4
    PermanentEmployee(){
        System.out.println("PermanentEmployee constructor");
    }

    //execute - 2
    static{
        System.out.println("PermanentEmployee static");
    }

    public void calculateSalary(){
        salary =  this.basicSalary + this.hra + this.da;
        System.out.println("Salary is: " + salary);
    }
}
public class Inheritance {
    static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee();
        emp.setEmpId(14475);
        emp.calculateSalary();
    }
}
