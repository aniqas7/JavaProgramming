package day41_exceptions.Employee;

public abstract class Employee extends Person {
    //instance variables
   private String jobTitle;
    private final int ID;
    private double salary;

    //constructor
    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
       if(ID <0){
           throw new RuntimeException("invalid ID");
       }
        this.ID=ID;
        setJobTitle(jobTitle);
        setSalary(salary);

    }


    //getters

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    //setters
    public void setSalary(double salary) {

        if (salary < 0) {
            throw new RuntimeException("Invalid salary");
        }
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }

//methods

    public abstract void employeeTask();

    @Override
    public String toString() {
        return "Employee{" + "name: "+getName()+", age: "+getAge()
                +", gender: "+getgender()+
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }

    public void sleep(){
        System.out.println(getName()+" is sleeping");


    }
}
