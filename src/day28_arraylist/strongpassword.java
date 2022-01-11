package day28_arraylist;

public class strongpassword {
    public static void main(String[] args) {
        String password="Cydeo1990@";
        boolean r1=password.length()>=8&&(!password.contains(" "));
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

        for (char each : password.toCharArray()) {

            if(Character.isUpperCase(each)){
                r1=true;}
            else if(Character.isLowerCase(each)){
                 r2=true;//if this condition isn't met, it will remain false
                //as stated above
            }
            else if(Character.isDigit(each)){
                r3=true;
            }
            else{//(!Character.isLetterOrDigit(each)){
                r4=true;
            }


        }
        boolean isStrongPassword=r1&&r2&r3&&r4&&r5;
        System.out.println("Is strong password: "+ isStrongPassword);

    }
}
