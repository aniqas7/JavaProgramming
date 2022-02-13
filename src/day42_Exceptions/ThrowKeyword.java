package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    /*
    When an error occurs within a method, the method creates an object and hands it off to the runtime system.
    The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. ...
    This block of code is called an exception handler.
     */
    public static void main(String[] args) {
        System.out.println("enter your age:"); //-20
        Scanner scan= new Scanner(System.in);
        int age= scan.nextInt();

        if(age<0){
            throw new InputMismatchException("age can not be negative: "+age);
        } //this will also terminate the program.similar to System.exit. but this is proper way
        //this creates an object from the exception class
        /*

        if (age<0){
            System.err.println("invalid age: "+age);
            System.exit(1);
        }
        its better to use throw method instead because in Java
        creating an exception, shows that something went wrong.
        so its better to manually throw an exception
         */
        if (age>21){
            System.out.println("eligible to vote");
        }
        else{
           throw new InputMismatchException("you must be at least 21 years old");
        }
    }
}
