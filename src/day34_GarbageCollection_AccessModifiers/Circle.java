package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius) {
        this.radius = radius;
    }

    static {
        // radius = 5;
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/
}
//main method cannot be used automatically by itself outside of its class
//it can't run on its own outside of its class. so we use static block