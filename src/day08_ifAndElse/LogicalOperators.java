package day08_ifAndElse;

import practice.JavaComponents;

public class LogicalOperators {

    public static void main(String[] args) {

        String name= "Steven";
        int age= 18;
        String citizen= "USA";


        boolean isEligible= age>=18 && citizen =="USA";
                            //19>=18 true
                                        //false , from UK
        System.out.println(name + " is eligible to vote " + isEligible);




        String name2="Josh";
        int creditScore= 720;
        int age2= 23;

        boolean isEligible2= creditScore>=700 && age2>=21;
        System.out.println(name2 +" is eligible for loan " + isEligible2);

        String name3 = "Shay";

        int age3= 21;
        char gender= 'F';

        boolean isEligible3= age3 >=18  && (gender=='M' || gender =='F');
        System.out.println(name3+ " is eligible for selective service "+ isEligible3);

        String name4= "James";
        String countryOfBirth= "UK";
        boolean marriedToUSCitizen= false;

        boolean isEligible4= countryOfBirth=="USA" || marriedToUSCitizen==true;
        System.out.println(name4 + " is eligible for citizenship "+ isEligible4);


        boolean result2=true;
        System.out.println(result2);

        boolean result3=!result2;
        System.out.println(result3);


        int score=85;
        boolean pass= score>=60;
        boolean failed= !pass;

        System.out.println(score + " is "+ pass);
        System.out.println(score + " is " + failed);


        System.out.println("123"+4+5);
        System.out.println("123"+1);
        System.out.println(123+1);


    }
}
