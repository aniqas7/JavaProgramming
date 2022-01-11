package day08_ifAndElse;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Josh";
        int age= 13;
        String citizen= "USA";

        boolean isEligible= age>=38 && citizen=="USA";
        boolean isNotEligible=!isEligible;


        if (isEligible){
            System.out.println(name+ " is eligible");
        }
        if (isNotEligible) {
            System.out.println(name + " not eligible");

        }
    }
}
