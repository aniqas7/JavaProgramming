package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class counttotalgrades {
    public static void main(String[] args) {
        ArrayList<Integer>scores= new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;
        for (Integer each : scores) {
            if(each>=90&&each<=100){
                gradeOfA.add(each);
                countA++;
            }
            else if(each>=80&&each<=89){
                gradeOfB.add(each);
                countB++;
            }else if(each>=70&&each<=79) {
                gradeOfC.add(each);
                countC++;
            }else if(each>=60&&each<=69) {
                gradeOfD.add(each);
                countD++;
            }else{
                gradeOfF.add(each);
                countF++;
            }

        }
        System.out.println(gradeOfA+" "+countA);
        System.out.println(gradeOfB+" "+countB);
        System.out.println(gradeOfC+" "+countC);
        System.out.println(gradeOfD+" "+countD);
        System.out.println(gradeOfF+" "+countF);

    }
    /*
    8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

     */
}
