package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void eat(){
        System.out.println(name+ "is eating");
    }
    public void bark(){
        System.out.println(name+ "is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
name, age, gender, breed, size, color

Actions:
eat(), play(), bark()....
 */