package practice;

import java.util.Scanner;

public class firstuniquechar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch= str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch1=str.charAt(j);

                if(ch==ch1){
                    count++;
                    continue;
                }
                if (count ==1){
                    result=str.indexOf(ch);

                }

            }

        }
        System.out.println(result);
    }
}
