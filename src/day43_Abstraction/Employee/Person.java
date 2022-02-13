package day43_Abstraction.Employee;
//instance variables
public abstract class Person {
    private String name;
    private char gender;
    private int age;

    //constructor- adding constructor makes it mandatory for child class to set these
    // variables that have been initialized
    public Person(String name, int age, char gender, int ID, String jobTitle, double salary) {
    setAge(age);
    setGender(gender);
    setName(name);
    }
    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getgender() {
        return gender;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new RuntimeException("invalid age: "+ age);
        }
        this.age = age;
    }


//methods

    public abstract void sleep();

    public void eat(){
        System.out.println(name+" is eating baklava");
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
