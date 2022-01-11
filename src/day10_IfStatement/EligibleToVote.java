package day10_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        int age=18;
        String citizen = "Citizen";
        String ID= "ID";

        boolean eligibleToVote= age>18 && citizen=="Citizen";
        boolean notEligibleToVote= !eligibleToVote;

        if (age>=18){
            System.out.println("Eligible to Vote");
        }

    }
}
