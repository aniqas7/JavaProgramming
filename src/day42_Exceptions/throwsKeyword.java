package day42_Exceptions;

public class throwsKeyword {
    //only handles checked exception
    //if you know that you won't be calling this method again, ue throws
    //if its in utility class, and you need to keep calling the method, use try catch ALWAYS
    //Thread.sleep method does not have body, so thats why it originally has throws not try catch method
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----test 1-----");

        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------test 1 completed----");

        System.out.println("----test 2-----");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("batch 25");

        System.out.println("-------test 2 completed----");
    }
}
