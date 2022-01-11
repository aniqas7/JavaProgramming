package practice;

public class AgeGroups2 {
    public static void main(String[] args) {

        int age=50;
        String age1="";

        if(age>0&&age<150){

            if(age<21){
                age1="teen";
            }
            else if(age>=21 && age<55){
                age1= "adult";
            }
            else {
                age1= "senior";
            }
        }
        else {
            age1= "invalid age";
        }
        System.out.println(age1);
    }
}
