package day11;

public class Grade {
    public static void main(String[] args) {

        char ch='D';
        String result="";

        switch(ch){

            case 'A':
                result="excellent";
                break;

            case 'B':
                result="great";
                break;

            case 'C':
                result="good";
                break;

            case 'D':
                result="pass";
                break;
            case 'F':
                result="fail";
                break;
            default:
                result="invalid";


        }
        System.out.println(result);
    }
}
