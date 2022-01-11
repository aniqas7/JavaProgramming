package Day05Concatination;

public class FullName {

    public static void main(String[] args) {

        String firstName= "Aniqa";
        String lastName="Siddiqi";
        String fullName= firstName + "  "+ lastName; //important
        int age= 24;
        String jobTitle= "SDET";
        String companyName= "Google";
        double salary= 100000.58;

        System.out.println(firstName +" "+ lastName);


        //Full name of the person is

        System.out.println("Full name of the person is " + firstName+ " " + lastName);

        //___ is ___ years old

        System.out.println(fullName + " is" + " "+ age+ " years old");

        //fullName is jobTitle, works at companyName, and FullName' salary is Salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "s' salary is $" + salary);


        int minutes= (3695/60)%60;
        System.out.println(minutes);

        double seconds= (((3695/60.0)%60.0)*60.0)%60.0;
        int secondz= (int) seconds;


        System.out.println("seconds= " +seconds);




                //(inputSeconds%3600)%60;





        int sec3=(3695/60)%60;
        System.out.println(sec3);

        int min= 3695%3600;
        System.out.println(min);



    }
}
