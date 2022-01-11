package day04_variables;

import javax.lang.model.SourceVersion;

public class Circle {

    public static void main(String[] args) {
        //calculate area and perimeter of circle

        double pi= 3.14;
        double radius= 5.5;
        double diameter= radius*2;
        double area= pi*radius*radius;
        double perimeter= 2*pi*radius;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
