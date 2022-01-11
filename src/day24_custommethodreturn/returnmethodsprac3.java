package day24_custommethodreturn;

public class returnmethodsprac3 {
    public static void main(String[] args) {

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));

            if(frequency==1) {
                System.out.println(str.charAt(i));
            }
        }

    }

    //aaa  'a'
    public static int frequency(String str, char ch) {

        //compare this char with every character of the string

        int count = 0;

        for (char each : str.toCharArray()) {
            //checks each character of the string
            //for each can only be used with data structure like array
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
}
