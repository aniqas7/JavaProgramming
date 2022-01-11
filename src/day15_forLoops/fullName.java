package day15_forLoops;

public class fullName {
    public static void main(String[] args) {

        String firstName= "cyDEo";
        String lastName = "SCHOOL";

        //cant use char at bc its char not string, upper case is string

       firstName= firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
                    //CyDEo                                     Cydeo

        //convert char to string bc cant use charAt with string/uppercase
        firstName=(""+ firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        //"C"
        lastName= lastName.substring(0,1).toUpperCase().substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);
        String fullName= firstName+ " "+ lastName;
        System.out.println(fullName);


    }
}
