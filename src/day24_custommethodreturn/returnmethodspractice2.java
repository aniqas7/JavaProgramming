package day24_custommethodreturn;

public class returnmethodspractice2 {
    public static void main(String[] args) {

        String gradestr = grade(80);

        //check the grade

        if (gradestr == "A") {
            System.out.println("Excellent");
        } else if (gradestr == "B") {
            System.out.println("Great");
        } else if (gradestr == "C") {
            System.out.println("Good");
        } else if (gradestr == "D") {
            System.out.println("Pass");
        } else if (gradestr == "F") {
            System.out.println("Fail");
        }
    }

        //create a function that can calculate the grade

    /*
    check the grade:
    'A'==> Excellent
    'B'==> Great
    'C'==> Good
    'D'==> Pass
    'F'==> Fail
     */
        public static String grade ( int score){
            String result = "";

            if (score < 0 || score > 100) {
                result = "invalid";
            } else { //valid
                result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";


            }
            return result;
        }
    }



