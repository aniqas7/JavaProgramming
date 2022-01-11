package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;

public class createmethod {

    public static void main(String[] args) {
        odd();
        even();
        agetobuyalcohol(19);
        eligibletovote(17,"USA");
        grade(70);
        area(2);
        areaofsq(4);
        dollartoeuro(5);
        kgtolb(5);
        posorneg(0);
        printeachchar("hello");
        element(new int[]{1, 2, 3, 4,5,6,7});
        calc(8,4,'+');
        fullname("aNiqa", "siDdiqI");
        anagram("silent","listen");
    }


    public static void odd (){

        for (int i = 1; i <=100 ; i+=2) {
            System.out.print(i+" ");

        }

    }

    public static void even(){
        System.out.println(" ");

        for (int i = 0; i < 100; i+=2) {
            System.out.print(i+" ");

        }
    }

    public static void agetobuyalcohol (int years){
        System.out.println("");
       boolean agetobuyalcohol= years>=18;
        System.out.println(agetobuyalcohol);

    }

    public static void eligibletovote(int age, String isCitizen){

        boolean iseligible= age>=18;
        String country= "USA";
        if(iseligible==true&&country=="USA"){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }

    }

    public static void grade(int score){
        if(score>=90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else if(score>=60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }

    public static void area(double radius){
        double area= 3.14*radius*radius;
        System.out.println(area);
    }

    public static void areaofsq(double side){
        double areaofsq=2*(side+side);
        System.out.println(areaofsq);

    }

    public static void dollartoeuro(double dollar){
        double dollartoeuro=dollar*.89;
        System.out.println(dollartoeuro);
    }

    public static void kgtolb(double kg){
        double kgtolb=kg*2.2;
        System.out.println(kgtolb);
    }

    public static void posorneg(int num){

        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

    }

    public static void printeachchar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
    }

    public static void element(int array[]) {

        for (int each : array) {
            System.out.println(each);

        }
    }

    public static void calc(double num1, double num2, char mathoperator){

        if (mathoperator=='+'){
            System.out.println(num1+num2);
        }
        else if(mathoperator=='-'){
            System.out.println(num1-num2);
        }
        else if(mathoperator=='*'){
            System.out.println(num1*num2);
        }
        else{
            System.out.println(num1/num2);
        }
    }

    public static void fullname(String first, String last){
        String firstname= first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        String lastname= last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        System.out.println(firstname+" "+lastname);

    }

    public static void anagram(String one, String two){

        char ch[]=one.toCharArray();
        char ch2[]=two.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        boolean istrue=Arrays.equals(ch,ch2);
        System.out.println(istrue);

        }

}
