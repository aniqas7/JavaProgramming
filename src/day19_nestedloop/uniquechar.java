package day19_nestedloop;

public class uniquechar {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result= "";//bdf

        for (int j = 0; j < str.length(); j++) {

        char ch='a';
        int count=0;//represents frequency of variable

        for (int i = 0; i < str.length(); i++) {
            //compares the character that outer loop picked with
            //each character of the string. whenever it is matched
            //count will be increased by one.
            char each = str.charAt(i); //each character of str

            if (ch == each) {
                count++;
            }
        }

        if (count==1){ //if frequency is 1, unique
            result+=ch;
        }
        /* if(count !=1){
        continue;
        }
        result +=ch;
         */

        System.out.println(result);

        }

    }
}
