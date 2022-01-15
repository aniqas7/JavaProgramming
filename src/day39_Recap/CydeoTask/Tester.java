package day39_Recap.CydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int EmployeeID, String jobTitle, double Salary) {
        super(name, age, gender, EmployeeID, jobTitle, Salary);
    }

    public void createTicket(){

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the application");
    }
}
