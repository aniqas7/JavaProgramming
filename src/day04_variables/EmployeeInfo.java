package day04_variables;

import java.sql.SQLOutput;

public class EmployeeInfo {
//start variable names with first name lowercase
    public static void main(String[] args) {
        String name = "Aniqa";
        int age= 24;
        char gender= 'F';
        String CompanyName= "Google";
        String JobTitle= "SDET";
        double yearsOfExperience= 4.5;
        int Salary= 150_433_090; //can't use comma, use underscore
        boolean isFullTime= true;
        boolean isMarried= false;
        String employeeID= "(542),422,101";
        String SSN= "(123),456,789";


        System.out.println(JobTitle);
        System.out.println("SSN = " + SSN);
        System.out.println("isMarried = " + isMarried);
        System.out.println("CompanyName = " + CompanyName);
    }
}
