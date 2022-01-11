package practice;

public class CharacterIdentity {
    public static void main(String[] args) {
/*4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table


 */
        char variable= 122;


        boolean number= 48<=variable && variable<=57;
        boolean UpperCaseLetter= 65<=variable && variable<=90;
        boolean LowerCaseLetter= 97<=variable && variable<=122;

        if(number){
            System.out.println("character is a number");
        }
        else if(UpperCaseLetter){
            System.out.println("character is an upper case letter");
        }
        else if(LowerCaseLetter){
            System.out.println("character is a lower case letter");
        }
        else{
            System.out.println("Special Character");
        }

    }
}
