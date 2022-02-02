package day41_exceptions;

import day30_CustomClass.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class checked_vs_unchecked {
//unchecked exception:
public static void main(String[] args) {


    int a = 10;
    int b = 0;
   // System.out.println(a/b);
    //compiler can't check while writing the code.
    // exception occured during run time. can't continue till its dealt with
    //exit method occurs automatically, terminates the program

    char[] characters={'A','B','C'};
    //                  0   1   2

  //  System.out.println(characters[3]);


    Student student= null; //student object was never created
    //System.out.println(student.getName());//you need an object to call instance method
    //getter is an instance method. you need an object to call it
    //compiler can't tell that no object of student has been created, so it happens during runtime

    String str="Wooden Spoon"; //garbage collector collects this object
   // str=null; //no object

    String str2;
   // System.out.println(str2.toUpperCase(Locale.ROOT)
   // );

    //checked exception:
    System.out.println("hello");
    //Thread.sleep(3000); //pauses code for this many seconds
    System.out.println("world");

    //FileInputStream file= new FileInputStream("path of the file");

}
}
