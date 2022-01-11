package day08_ifAndElse;

public class GradeReport {
    public static void main(String[] args) {

        System.out.println(true==!false);//true
        System.out.println(!true !=false);//false
        System.out.println(!false ==true); //true

        System.out.println(!!false);//false


        /*...*/

        int score =85;
        boolean excellent= score>=90 && score <=100;
        boolean great= score>=80 &&  score <89; //score>=80 && !excellent
        boolean good= score>=70 &&  score <=70; //boolean c=!a && !b && score>=70
        boolean passed= score>=60 && score <=69;
        boolean failed= score>=0 &&  score <=59;

        if(excellent){
            System.out.println("Excellent");
        }

        if (great) {
            System.out.println("Great");
        }

        if(good) {
            System.out.println("Good");
        }

        if (passed) {
            System.out.println("passed");
        }

        if (failed) {
            System.out.println("Failed");
        }



        /*
        score
        90~ 100 --> excellent
        80~ 89 --> great
        70~ 79 --> good
        60~ 69 --> passed
        0~ 59 --> failed
         */
    }
}
