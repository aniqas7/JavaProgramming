package day20_forEach;

import java.util.Arrays;

public class forEachloopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));

        }

    }
}
