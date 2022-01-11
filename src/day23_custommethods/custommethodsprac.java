package day23_custommethods;

public class custommethodsprac {
    //create a function that can print hello world 5 times


    public static void main(String[] args) {

       HelloWorld5Times(); //call the method w/in main method
        hellocydeo5x();
        evennum();
    }
    public static void HelloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }
//command, highlight
    //create main method outside of the helloworld5times method.



    //create a function that can print hello cydeo 5x

    public static void hellocydeo5x(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo");

        }

        //create a function that can print even num between 1-10

            }


    public static void evennum() {
        for (int i = 0; i <=10;i+=2) {
            System.out.println(i);

        }
    }
}
