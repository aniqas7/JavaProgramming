package practice;

public class Arithmetic {
    public static void main(String[] args) {


        int sum= 1000+2000;
        System.out.println("sum = " + sum);


        System.out.println(2.5+3.5);

        System.out.println(100-30);

        //300-100 assign value to variable

        int value= 300-100;
        System.out.println(value);

        System.out.println(20 *6);
        int product= 20*6;
        System.out.println("product = " + product);

        System.out.println(10/4); //doesn't give accurate bc int
        System.out.println(10.0/4); //make it a decimal to get exact decimal result
        System.out.println(10/4d); //or you can add d

        /* remainder
        10/4=2.5
        remainder: numerator - (denominator * integer result)
        10 - (4*2)= 2
                 */

        //find remainder of 20/5

        System.out.println(20/5);
        System.out.println(20.0/6);
        System.out.println(20%6);

        //20/6, 20 - (6*3)



    }
}
