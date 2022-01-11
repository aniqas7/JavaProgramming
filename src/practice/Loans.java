package practice;

public class Loans {
    public static void main(String[] args) {

        int number=70_000;
        int score=651;
        boolean salary= number>60_000;
        boolean creditscore= score>650;

        String loanApproval= (salary && creditscore)? "loan approved" : "loan denied";
        System.out.println(loanApproval);

    }
}
