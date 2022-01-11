package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public double gpa;
    public char grade;

    public Student(String tahir, int i, char m, char b, int i1) {
    }

    public Student() {

    }

    //generate, enter, commandA selects all
    public void setInfo(String name, char gender, int age, int ID, double gpa) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.gpa = gpa;
    }
//this keyword with dot calls instance variables

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", gpa=" + gpa +
                '}';
    }
    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
