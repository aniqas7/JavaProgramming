package practice;

public class ShortHandOperators {
    public static void main(String[] args) {

        //asignment

        int a=100;

        a= 200; //assigns new value to a
        System.out.println(a);

        //addition assignment

        int b=200;
        b += 300; //first it will add 300 to 200, then assign the new value to b
        System.out.println(b);

        //subtraction

        int c=400;
        c -=100;
        System.out.println(c);

        //multiplication

        int d= 50;
        d *=20;
        System.out.println(d);

        //division

        int e= 20;
        e /= 4;
        System.out.println(e);  //result is being assigned back to the variable e

        //remainder

        int f=200;
        f %= 10; //remainder of 200/10
        System.out.println(f);






    }
}
