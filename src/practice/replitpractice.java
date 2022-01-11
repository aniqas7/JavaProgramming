package practice;

import java.util.Scanner;

public class replitpractice {



    public static void main(String[] args) {
        long workPhoneNumber, personalPhoneNumber;

        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName= scan.nextLine();
        System.out.println("Enter your last name");
        String lastName= scan.nextLine();
        System.out.println("Enter your email");
        String email=scan.nextLine();
        scan.nextLine();
        System.out.println("Enter your street");
        String street= scan.nextLine();
        System.out.println("Enter your city");
        String city= scan.next();
        System.out.println("Enter your state");
        String  state= scan.next();
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried=true;

        String contacts= "work phone number-"+workPhoneNumber+","+"personal phone number-"+personalPhoneNumber+","+"email:"+email;

        String fullName= "Full name:"+lastName+","+firstName;

        String address= "Address:"+street+","+city+","+state+zipcode;

        System.out.println(fullName+"\n"+address+"\n"+contacts+" "+"Age:"+age+"Height:"+height+"Weight:"+weight+"Married?:"+isMarried);


/*
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Enter your code here:
String firstName, lastName , email ,street , state ,city;
int age , zipCode;
double height , weight;
boolean isMarried;
long workPhoneNumber, personelPhoneNumber;
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the patient portal!\nPlease enter your personel information\nEnter your first name");
        firstName = scan.nextLine();
System.out.println("Enter your last name");
lastName = scan.nextLine();
System.out.println("Enter your email");
email = scan.nextLine();
System.out.println("Enter your street");
street = scan.nextLine();
System.out.println("Enter your city");
city = scan.nextLine();
System.out.println("Enter your state");
state = scan.nextLine();
System.out.println("Enter your zip code");
zipCode = scan.nextInt();
System.out.println("Enter your work phone number");
workPhoneNumber = scan.nextLong();
System.out.println("Enter your personal phone number");
personelPhoneNumber = scan.nextLong();
System.out.println("Enter your age");
age = scan.nextInt();
System.out.println("Enter your height");
height = scan.nextDouble();
System.out.println("Enter your weight");
weight = scan.nextDouble();
System.out.println("Are you married?");
isMarried = scan.nextBoolean();
System.out.println("Patient personel information");
System.out.println("Full name: "+lastName+", "+firstName);
System.out.println("Address: "+street+", "+city+", "+state+" "+zipCode);
System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personelPhoneNumber+", email: "+email);
System.out.println("Age: "+age);
System.out.println("Height: "+height);
System.out.println("Weight: "+weight+" pounds");
System.out.println("Married?: "+isMarried);


 */


    }
}