package day25_custommethodoverloading;

import utility.stringUtility;

public class Test {
    public static void main(String[] args) {

        String []names={"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count=0;

        for(String each:names){
            if(stringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
    }
}
