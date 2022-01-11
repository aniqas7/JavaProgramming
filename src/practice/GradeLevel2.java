package practice;

public class GradeLevel2 {
    public static void main(String[] args) {

        int grade=78;

        String gradelevel="";

        if (grade<=18 && grade>0){

            if (grade>=1&&grade<=5){
                gradelevel="elementary";
            }

            else if (grade>=6&&grade<=8){
                gradelevel="middle school";
            }

            else if (grade>=9&&grade<=12){
                gradelevel="high school";
            }
            else if (grade>=13&&grade<16){
                gradelevel="college";
            }
            else {
                gradelevel="grad school";
            }
        }

        else {
            gradelevel="invalid";
        }

        System.out.println(gradelevel);


    }
}
