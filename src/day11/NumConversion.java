package day11;

public class NumConversion {
    public static void main(String[] args) {

        int num=1;

        String number = (num>=0 && num<=9)? (num==0)? "zero" : (num==1)? "one" :(num==2)? "two" :(num==3)? "three" :(num==4)? "four"
                :(num==5)? "five" :(num==6)? "six" :(num==7)? "seven" :(num==8)?
                "eight" : "nine" : "invalid";
        System.out.println(number);

        /*
        2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary

         */
    }
}
