package custommethodsarraypractice;

public class UCequalsLCcount {
    public static void main(String[] args) {

        String str="JAVA java";

        int countUC=0;
        int countLC=0;
        for (char each : str.toCharArray()) {
            if (Character.isLowerCase(each)){
                countUC++;
            }
            else if(Character.isUpperCase(each)){
                countLC++;
            }
        }

        boolean isTrue=countUC==countLC;
        System.out.println(isTrue);



    }


}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */
