package day42_Exceptions;

import java.util.NoSuchElementException;

public class throwKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("there is no such element that is true"); // manually created an exception with object of exception.
        //every exception calls parent class constructor. parent class constructor takes string argument as exception message
   //you can only throw exception objects, any other objects you can't use throw bc it does not have relationship with throwable
        //you only use throw keyword when you need to terminate a program because it doesn't meet the condition

        //throw keyword can be used only with unchecked exception


    }
}
