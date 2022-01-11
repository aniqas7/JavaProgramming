package practice;

public class PrimitivePractice1 {

    public static void main(String[] args) {
        //integer:age,year,salary,miles
        byte age=24;
        short year=2021;
        int salary=80000;
        int miles=65000;  //int preferred
        long yards=9999999999l;

        //decimals:tax, pi
        float tax= 54.89f;
        double pi= 3.12304830402308240; //double preferred
        float pie= 3.12f;

        //symbols: @,#

        char at= '@';
        char pound= '#';

        //when printing values of variables, you do NOT use ""

        System.out.println(age);
        System.out.println(at);
        System.out.println(pi);

        boolean result1= 5>10;
        System.out.println(result1);

        int a=100;
        int b=200;
        boolean result2= b>a;

        System.out.println(result2);


    }
}
