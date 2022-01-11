package practice;

public class Grade {
    public static void main(String[] args) {

        char grade='G';
        String grade1="";

        if (grade>='A'&& grade<='F'){

            if (grade=='A'){
                grade1= "excelent";
            }
            else if (grade == 'B') {
                grade1= "great job";
            }
            else if (grade == 'C') {
                grade1 = "good";
            }
            else if (grade == 'D') {
                grade1 = "passed";
            }

            else {
                grade1="failed";
            }
        }

        else {
            grade1= "invalid";
        }

        System.out.println(grade1);


    }

}
