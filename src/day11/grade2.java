package day11;

public class grade2 {
    public static void main(String[] args) {


        char ch= 'C';
        String result= "";

        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result= "pass";
                break;
            case 'F':
                result= "fail";
                break;
            default:
                result= "invalid";

        }

        System.out.println(result);

        //if grade is A, B, C, D  --> pass
        //otherwise== fail
    }
}
