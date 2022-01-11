package day20_arrays;

import java.util.Arrays;

public class alphabets {
    public static void main(String[] args) {

        //contain 26 characters

        char[] alphabet = new char[26];

        char ch='Z';
        for(int i=0; i<alphabet.length; i++,ch--){
            alphabet[i]=ch;

        }
        System.out.println(Arrays.toString(alphabet));

// for(char i=0, j='Z'; i< alphabet.length; i++,j--)
        //alphabet[i]=j;

        //store z into index 0

        /*
        alphabet[0] = 'Z'; //90
        alphabet[1]='Y'; //89
        alphabet[2]= 88; //'Z'

        System.out.println(alphabet[0]); //prints element
        System.out.println(Arrays.toString(alphabet)); //prints the whole array. converts string to array


         */

    }

}
