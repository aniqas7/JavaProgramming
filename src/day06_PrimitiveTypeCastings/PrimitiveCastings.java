package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    //primitives
    //double>float>long>int>short>byte
    //assigning smaller primitive to larger primitivev
    //I can assign byte to int, double to float, small to big primitive

    public static void main(String[] args) {

        byte a=100;
        short b=a;
        // converts byte to short, and assigns it
        // to the variable "b"
        //short b= (short)a

        int x1=128;
        byte y1= (byte) x1;

        System.out.println(y1);

        int c= b;
        //int c = (int)b

        long d= c;

        //larger prmitives can NOT directly assigned to smaller primitive types
        //EXPLICIT CASTING

        int x= 55;
        short y= (short)x;

        System.out.println(x + " : " + y);

        long j= 1000000l;
        short k= (short)j;

        System.out.println(j + " : " +k);

        //there is not a million in short
        //you get 1000000 : 16960

        double l=2.5;
        float m= (float)l;

        System.out.println(l + " : " + m);

        double n= 10.8;
        int s= (int)n;

        System.out.println(n + " : " + s);

        double d1= 20.5;
        short s1= (short) d1;

        float f1=30.5F;
        long g1= (long) f1;
        //option enter = casting

        System.out.println(f1 + " : " + g1);


    }
}
