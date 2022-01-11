package day20_forEach;

import java.util.Arrays;

public class forEachLoopIntro {
    public static void main(String[] args) {

        int[]numbers= {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];

            System.out.println(eachElement);
            //prints element after finding index number. 2 steps
        }
            for(int each :numbers){
                System.out.println(each);
        }
    }
}
