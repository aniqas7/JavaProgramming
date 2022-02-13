package day42_Exceptions;

public class warmuptask {
    public static void main(String[] args) {

        System.out.println("Push up started");
        for (int i = 1; i <= 10; i++) {

            System.out.print("\rPush up " + i);//added an escape sequence, this will rewrite the new statement in the same line
            try {
                Thread.sleep(500);//checked exception,must be handled immediately before next step
            } catch (InterruptedException e) {
                e.printStackTrace(); //only catches exception during runtime
                //if exception is not caught during runtime, it will NOT get executed
            }
        }

        //do 20 pull ups in 1.5 seconds

        for (int i = 1; i <= 20; i++) {

            System.out.print("\rPull Up " + i);
            sleep(1.5);

/*
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        */
        }
    } //main method ended

        //custom method created to avoid having to handle exception each time
        //Thread.sleep is used. and we can insert seconds instead of milliseconds

        public static void sleep(double seconds){
            try {
                Thread.sleep((long)(seconds*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*
        try catch block. so if we don't handle this exception, no code after will run
        after handling it, future code will be executed.
        try {
            System.out.println(9 / 0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("hello!");

         */
    }

