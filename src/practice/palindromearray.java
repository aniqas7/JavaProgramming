package practice;

public class palindromearray {
    public static void main(String[] args) {

        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */

        String [] array= {"anna", "level", "Java"};
        int palindrome=0;
        for (String each : array) {
            String reverse="";
            for (int i = each.length() - 1; i >= 0; i--) {

                reverse+=each.charAt(i);

            if(each.equals(reverse)) {
                palindrome++;
            }
            }

        }
        System.out.println(palindrome);

    }
}
