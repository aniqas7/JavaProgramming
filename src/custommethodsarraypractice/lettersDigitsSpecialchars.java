package custommethodsarraypractice;

public class lettersDigitsSpecialchars {
    public static void main(String[] args) {
       String str = "1Wooden Spoon!";

        String letters1="";
        String digits1="";
        String ch1="";
        for (char each : str.toCharArray()) {
            if(each>=65&& each<=90 || each>=97&& each<=122){
                letters1+=each;
            }
            else if(each>=48&&each<=57){
                digits1+=each;
            }else{
                ch1+=each;
            }


        }
        System.out.println(letters1);
        System.out.println(digits1);
        System.out.println(ch1);
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */
