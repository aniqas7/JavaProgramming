package day06_PrimitiveTypeCastings;

import java.sql.SQLOutput;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12"+1);//121
        //1 is not a variable its a value

        System.out.println(100-50);//50
        System.out.println(100+50);//150
        System.out.println(10*6);//60
        System.out.println(10/5);//2
        System.out.println(10/4);//2
        System.out.println(10/4d);//2.5 add d for double to get accurate decimal result
        System.out.println(10%4); //2
        System.out.println(10%5); //0
        System.out.println(100/3d);
        System.out.println(100%3d);

        int a=100;
        double b= a/6; //16.0 //there is no "d" it doesn't give correct value
        System.out.println(b);

        double c= a/6.0; //16.66;
        double c1= (double)a/6; //16.66;
        System.out.println(c);

    }
}
