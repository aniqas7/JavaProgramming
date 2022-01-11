package practice;

public class PracticeTasksNov7 {
    public static void main(String[] args) {

       /*1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10

        */

        int a= 10;
        int b= 15;

        int cost= a;
            a=b;
            b= cost;

        System.out.println("a= "+ a);
        System.out.println("b= "+b);

        //x=100, y=200;

        int x=100;
        int y=200;

        int temp = x;
            x = y; //200
            y = temp; //100

        System.out.println(x);
        System.out.println(y);


/*
we can't do this:

int a =10;
int b=15;

b =a; //b=10 bc b is reassigned to 10
a =b; //now a is still 10, bc b's value is 10 now since we reassigned it

instead we can add a variable

int a=10;
int b=15;
int c= b; //c=15

b=a; //b=10
a=c; //a=15

 */






    }
}
