package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("test started");

        try {

            System.out.println(9 / 0);
            System.out.println("try block");

        } catch (ArithmeticException e) {
            System.out.println("catch block");
            System.out.println("arithmetic exception is caught");
        }
        System.out.println("test completed");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]); //unchecked exception
            System.out.println("try block");
        } catch (RuntimeException e) {
            //System.out.println("catch block");
            // System.out.println("runtime exception");
            e.printStackTrace();
            //e.getMessage();

        }
        System.out.println("hello world");


        try {
            System.out.println("Cydeo".substring(2, 0));//unchecked
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream file = new FileInputStream("File path");
            System.out.println("aniqa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("siddiqi");
        }

        try{
            Thread.sleep(3000);
            System.out.println("dog");
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("cat");
        }

        try {
            FileInputStream file= new FileInputStream("file path");
            System.out.println("try");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("catch");
        }
        System.out.println("does it print");

        try {
            System.out.println("try".substring(2, 4));
            System.out.println("try exectued");
        }
        catch (ArithmeticException e){
            System.out.println("catch executed");
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block"); //prints finally block but not next print statement, did it terminate
        }
        System.out.println("this is printing");

    }
}
