package day08_ifAndElse;

public class Month {
    public static void main(String[] args) {

        //write a program that can display the name of the month

        int month= 2;
        boolean January= month==1;
        boolean February= month==2;
        boolean March= month==3;
        boolean April= month==4;
        boolean May= month==5;
        boolean June = month==6;
        boolean July= month==7;
        boolean August= month==8;
        boolean September= month==9;
        boolean October= month==10;
        boolean November= month==11;
        boolean December= month==12;

        if(January) {
            System.out.println("January");
        }
        if(February) {
            System.out.println("February");
        }
        if(March) {
            System.out.println("March");
        }
        if(April) {
            System.out.println("April");
        }
        if(May) {
            System.out.println("May");
        }

        if(June) {
            System.out.println("June");
        }

        if(July) {
            System.out.println("July");
        }

        if(August) {
            System.out.println("August");
        }

        if(September) {
            System.out.println("September");
        }

        if(October) {
            System.out.println("October");
        }

        if(November) {
            System.out.println("November");
        }

        if(December) {
            System.out.println("December");
        }

        /*....*/

        //Create a class called NameOfTheDay, write a program that can display the name of the day
        //
        //            number = 1 ~ 7

        int day = 4; //thurs

        boolean Mon= day==1;
        boolean Tues= day==2;
        boolean Wed= day==3;
        boolean Thurs= day==4;
        boolean Fri= day==5;
        boolean Sat= day==6;
        boolean Sun= day==7;

        if (Mon){
            System.out.println("Mon");
        }
        if (Tues){
            System.out.println("Tues");
        }
        if (Wed){
            System.out.println("Wed");
        }
        if (Thurs){
            System.out.println("Thurs");
        }
        if (Fri){
            System.out.println("Fri");
        }
        if (Sat){
            System.out.println("Sat");
        }
        if (Sun) {
            System.out.println("Sun");
        }

        /*
        3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
         */

        int num= 1;
        boolean has28Days= num==2;
        boolean has30Days= num==4 || num==6 || num==9 || num==11;
        boolean has31Days= num==1 || num==3 || num==5 || num==7 || num==8 || num==10 || num==12;
        //boolean has31Days=!has28days && !has30days;

        if(has28Days){ //if the month has 28 days
            System.out.println("has 28 days");
        }
        if(has30Days){
            System.out.println("has 30 days");
        }
        if (has31Days){
            System.out.println("has 31 days");
        }
















    }
}
