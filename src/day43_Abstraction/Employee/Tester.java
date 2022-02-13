package day43_Abstraction.Employee;

public final class Tester extends Employee {
    //add constructor, use super because we are calling parent class constructor
    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary){
        super(name,age,gender,ID,jobTitle,salary);
    }

    public void employeeTask(){
        System.out.println(getName()+" is testing code");
    }
    public void sleep(){
        System.out.println("is sleeping");
    }
    public void bugReport(){
        System.out.println(getName()+ " is creating bug report");
    }

}
