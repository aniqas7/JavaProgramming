package practice;

public class uniquechars {
    public static void main(String[] args) {
        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));

            if (frequency == 1) {
                System.out.println(str.charAt(i));
            }

        }

    }

    public static int frequency(String str, char ch) {
        //sub ch with charAti

        int count = 0;

            for (char each : str.toCharArray()) {
                if (each == ch) {
                    count++;
                }


        }   return count;

    }
}



    //display unique characters of a string

