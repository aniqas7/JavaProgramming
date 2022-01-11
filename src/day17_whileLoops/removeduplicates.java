package day17_whileLoops;

public class removeduplicates {
    public static void main(String[] args) {
        String str= "AA";
        String result= "";
        int frequencyA=0;

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i) + "";
            if (result.contains(ch)) {
                frequencyA++;
                continue;

            }
            result +=ch;
        }

        System.out.println(result);
        System.out.println(frequencyA);
    }
}
