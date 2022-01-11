package day28_arraylist;

public class strongpassword2 {
    public static void main(String[] args) {
        String password="Cydeo1990@";
        int countUpperCase=0;
        int lowerCase=0;
        int specialchars=0;
        int number=0;
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            } else if (Character.isDigit(each)) {
                number++;
            } else {
                specialchars++;
            }
        }
        System.out.println("number = " + number);
        System.out.println("specialchars = " + specialchars);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("countUpperCase = " + countUpperCase);

        boolean hasuppercase= countUpperCase>0;
        boolean haslowercase=lowerCase>0;
        boolean hasnumber=number>0;
        boolean hasspecialchars=specialchars>0;

        boolean strongpassword= haslowercase&&haslowercase&&hasnumber&&hasspecialchars&& password.length()
                >=8&&!password.contains(" ");
        System.out.println(strongpassword);
    }
}
