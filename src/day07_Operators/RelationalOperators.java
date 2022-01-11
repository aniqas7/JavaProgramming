package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //>, >=, <, <=

        boolean result1= 20>40;
        System.out.println("result1 = " + result1); //false

        boolean result2= 300>=150;
        System.out.println("result2 = " + result2); //true

        boolean result3= 100>=100; //true
        System.out.println("result3 = " + result3);

        boolean result4= 300 >=500; //false
        System.out.println("result4 = " + result4);

        //credit score of 720

        int creditScore =745;
        boolean isEligibleForLoan = creditScore >=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        int score =59;
        boolean hasFailed= score<=59;
                        //score<60
        System.out.println("hasFailed = " + hasFailed);

        int x=100;
        int y=200;

        boolean equal= x==y;//false
        System.out.println("equal = " + equal);

        boolean result8= "Muhtar" == "Good guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9= 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10= 'A' == 'A'; //true
        System.out.println("result10 = " + result10);

        boolean result11= 100 !=200.5; //true
        System.out.println("result11 = " + result11);

        boolean result= "Java" != "Break";




    }
}
