package practice;

import org.w3c.dom.ls.LSOutput;

public class UnaryOperators {
    public static void main(String[] args) {

        int a= -100;
        int b= +200;

        boolean aIsNegative= a<0;
        boolean bIsPositive= b>0;

        System.out.println(aIsNegative);
        System.out.println(bIsPositive);

        //increment and decrement


        int x=10;
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(--x);

        int y=20;
        System.out.println(x++);
        System.out.println(y++);
        System.out.println(y++);
        System.out.println(y--);
        System.out.println(y--);

        int q=100;
        System.out.println(q--); //100
        System.out.println(q--); //99
        System.out.println(q++); //98
        System.out.println(q++); //99
        System.out.println(q);



    }


}
