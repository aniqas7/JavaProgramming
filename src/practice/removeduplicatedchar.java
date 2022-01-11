package practice;

public class removeduplicatedchar {
    public static void main(String[] args) {


        String str = "aabccdde";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int frequency = duplicated(str, str.charAt(i));

            if (frequency==1){
                result+=str.charAt(i);

            }

        } System.out.print(result);

    }

    public static int duplicated(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {

            if (each == ch) {
                count++;
            }
        }
        return count;

    }

}
