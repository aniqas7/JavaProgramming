package day10_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {



    /*2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

     */

    int a =10; //20
    int b=15; //10
    int c=20; //15

    boolean medianIsA= b<a && c>a || a>c && a<b;
    boolean medianIsB= a<b && b<c || b<a && b>c;
    boolean medianIsC= a<b && c<b || c<b && a>c;
    //boolean medianIsC= !medianIsA && !medianIsB;

        /*in order for a to be the median number:
        1.if c is max number and b is min number
        2.if b is max number and c is min number
         */

    if (medianIsA){
        System.out.println("medianIsA");
    }

        if (medianIsB){
            System.out.println("medianIsB");
        }

        if (medianIsC){
            System.out.println("medianIsC");
        }

    }
}
