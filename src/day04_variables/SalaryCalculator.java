package day04_variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*write a program that can calculate the salary of an employee based on
         hourlyRate and weeklyHours
         hourlyRate=
         weeklyHours=
         */

        int hourlyRate= 50;
        int weeklyHours= 40;
        int salary= hourlyRate*weeklyHours*52; //we wrote 52 bc its always 52 weeks, but if its changing, then we can make it into a variable

        System.out.println(salary); //do not use "" bc it makes it into a string of text, not a variable
        System.out.println("weeklyHours = " + weeklyHours); // use soutv to print variables
        System.out.println("salary = $" + salary);
        System.out.println("hourlyRate = $" + hourlyRate); //add $ here
    }
}
