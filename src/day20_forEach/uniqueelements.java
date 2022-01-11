package day20_forEach;

import java.util.Arrays;

public class uniqueelements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) {

        int count=0;
        for (String element : words) {

            if (element.equals(each)) {
                count++;
            }

        }
        if (count==1){
            System.out.println(each);
        }

        }




        /*forloopmethod
        for (int i = 0; i < words.length; i++) {
            int frequency=0;
            String element= words[i];
            for (int j = 0; j < words.length; j++) {
                if (element.equals(words[j])) {
                    frequency++;
                }
            }
                if( frequency==1){
                    System.out.println(element);

                }

        }

         */
    }
}
