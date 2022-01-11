package day04_variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age:38 years old

        byte age= 38;

        //weight:168 pounds. we cannot use byte bc its out of the range 127
        short weight= 168;

        //salary:100000. we cannot use short bc its out of the range 32k

        int salary= 100000; //int is preferred data type

        //long: 1_111_111_111. you need to use l at the end

        long annualSalary=1_111_111_111L;

        System.out.println(annualSalary);


        //float and double are for decimals

        //tax: .26

        float tax= .26F; //you need to add F

        //pi: 3.124

        double pi= 3.124; //preferred type

        //#

        char ch1='#';
        char ch2=3500;

        //values are not put in ' ' and represents a foreign character
        System.out.println("ch1 = " + ch1);
        System.out.println(ch2);

        char gender= 'F';
        char grade= 'F';
        char yesNo= 'Y';

        System.out.println(gender);

        boolean result= 100>300;

        //string= sequence of characters/string of text

        String name= "Wooden Spoon";
        String city= "McLean";
        String state= "Virginia";
        String country= "USA";

        System.out.println("country");
        System.out.println(country);

        String ssn= "(123)-78-9876";

        System.out.println(ssn);


    }
}
