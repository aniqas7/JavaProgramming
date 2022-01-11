import day30_CustomClass.Dog;

public class dog {

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
class dogobject{
    public static void main(String[] args) {
        Dog dog1  = new Dog();

        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size= "Small";
        dog1.color= "white";

        System.out.println(dog1);
    }

}
