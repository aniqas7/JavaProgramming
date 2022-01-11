package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1= +25;
        int num2= -25;

        System.out.println(num1<0); //false
        System.out.println(num2<0); //true

        int a= 5;
        ++a; //pre increment: increases the value by 1 immediately
        System.out.println(a);

        --a; //pre decrement: decreases the value by 1 immediately
        System.out.println(a);


        int b=100;
        System.out.println(++b);
        //happens right away +1

        int c=100;
        System.out.println(c++);
        //current value, 100
        System.out.println(c);
        //101
        System.out.println(c--);
        //101
        System.out.println(c);
        //100
        System.out.println(--c);
        //99

        int z=45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z); //47

        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//29
    }
}
