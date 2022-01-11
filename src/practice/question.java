package practice;

public class question {
    public static void main(String[] args) {


        int ivar = 100;
        double dvar = 123d;
        float fvar = 200;
        ivar = (int) fvar;
        fvar= ivar;
        dvar =fvar;


        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3+4));


        long a=30L;
        long b= (short) a;
        System.out.println(b);

        //30

        float a1=100.987_65f;
        short b1=(byte)a1;
        byte c1=(byte)b1;
        System.out.println(b1);
        System.out.println(c1);



        //100
        //100


        int a2=3, b2=2;
        long c2=(a2+b2)*2/3%2;
        System.out.println(c2);

        long a3=3_000L;
        double b3= (float)a3;
        int c3= (short) (b3);
        System.out.println(c3%1000);

        System.out.println( (int) (10/3.0));







    }
}
