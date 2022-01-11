package day14_stringmethod;

public class stringmethod3_substring {
    public static void main(String[] args) {

        String word= "Cydeo School";
        String brand= word.substring(0,4+1);
        System.out.println(brand);

        String str1= word.substring(6);
        System.out.println(str1);

        String word2= "Java Programming Language";

        String s1; //"Java"
        String s2; //Programming
        String s3; //Language

        s1= word2.substring(0,word2.indexOf(" ") );
        System.out.println(s1);

        s2= word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        System.out.println(s2);

        s3= word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s3);



    }
}
