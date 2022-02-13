package day42_Exceptions;

public class disadvantageofThrows {
    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));
    }

    public static void main(String[] args) {
        System.out.println("hello");
        //sleep(2.5); must be handled
        System.out.println("bye");

        System.out.println("-----");


        System.out.println("hello");
        warmuptask.sleep(2.5); //no need to handle it again
        System.out.println("bye");
    }
}
