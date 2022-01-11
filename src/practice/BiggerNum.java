package practice;

public class BiggerNum {
    public static void main(String[] args) {

        int n1= 10;
        int n2=21;
        int n3=3;

        boolean n1isbiggest= n1>n2 && n1>n3;
        boolean n2isbiggest= n2>n1 && n2>n3;
        boolean n3isbiggest= n3>n1 && n3>n1;

        String largestvalue= (n1isbiggest)? "n1 is biggest" : (n2isbiggest)? "n2 is biggest" : "n3 is biggest";
        System.out.println(largestvalue);


    }
}
