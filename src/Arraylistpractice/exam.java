package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        /*
        int a = 0;
        do{
            a=a++ + --a- (a%3);
            System.out.println(a);
        }while (++a<4);
        System.out.println(a);

         */
/*
        String str= "I will find the lost book";
        String word="";
            for(int i= str.length()-1; i<=0; i--){
                word+= str.charAt(i);
                System.out.println(word);
            }
        System.out.println(word);
    }


       int count=0;
       for(int a=0; a<4; a++){
           if (a==3) continue;
           for(int b=a+1; b<5; b++){
               count++;

               if (b==3)break;
           }
       }

        System.out.println(count);


 */

int[] nums={14,1,84,97,1243,46};
int total=0;

for(int i=0; i< nums.length; i++) {
    if (nums[i]%2 !=0) {
        total += 3;
    }else{
        total+=10;
    }
    if(i%3==0){
        total-=15;
    }
}
        System.out.println(total);
}
}

