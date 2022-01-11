package day16_forloopstring;

public class digitsLettersSpecialChars {
    public static void main(String[] args) {

        String str="Cydeo12345School!@#$%WoodenSpoon";

        String digits= "";
        String letters= "";
        String specialchars= "";

        for (int i = 0; i < str.length(); i++) { //index numbers of str from 0 to last index

            char ch= str.charAt(i); //ch: each character that we have in str

            if (ch>'0' && ch<='9') {
                digits += ch;
            } else if (ch >= 'A'&& ch<= 'Z'){
                letters+= ch;
            } else if (ch >= 'a'&& ch<= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialchars += ch;

                }
            }

            System.out.println("digits= "+ digits);
            System.out.println("letters = " + letters);
            System.out.println("special chars= "+ specialchars);
        }

        //12345
        //!@#$%
        //cydeo
    }
}
