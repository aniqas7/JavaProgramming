package day03_EscapeSequences;

public class EscapeSequences {

    /* Escape sequences: Must be given with double quote
        \n: starts a new line
        \t: tab
        \\: \ one backslash
        \": to actually insert a quotation
     */

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        System.out.println("Hello Cydeo How are you all today? It's nice to see you all! What class do we have next week?");;
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------------");
        System.out.println("Java is cool programming language \nI think that learning this is fun \n\tThis is interesting subject");

        System.out.println("\\\\hi how are you?");
        /*
        this is showing how to do backslash. for every backslash you want to write, you need a backslash.
        one backslash is reserved for escape sequence. if you want to actually insert a backslash, add an extra one

         */

        System.out.println(" The book \"Hunger Games\" is very popular");


    }
}
