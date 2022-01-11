package day37_Inheritance.AnimalTask;

import day37_Inheritance.AnimalTask.Animal;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
    }

    public void bark(){

        System.out.println(name+" is barking");
    }

}


