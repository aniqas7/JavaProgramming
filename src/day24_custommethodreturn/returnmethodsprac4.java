package day24_custommethodreturn;

public class returnmethodsprac4 {
    public static void main(String[] args) {

        String str= "ccccccddddaaabbbbbe";
        str= removeDuplicates(str);
        System.out.println(str);


    }

    //remove duplicated char from string

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        return result;


    }
}
