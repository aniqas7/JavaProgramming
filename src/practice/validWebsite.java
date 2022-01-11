package practice;

import java.util.Scanner;

public class validWebsite {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter website:");
        String website=scan.next();

        boolean endsiwth= (website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov"));

        if(website.startsWith("www.")&& endsiwth){
            System.out.println("valid website");
        }
        else{
            System.out.println("invalid");
        }

        scan.close();
    }
}
