package practice;

import java.util.Arrays;

public class classinitials {
    public static void main(String[] args) {

        String []names= new String[10];
        names[0]="Aniqa Siddiqi ";
        names[1]="Mam ona";
        names[2]="Jan nat";
        names[3]="Aroo sha";
        names[4]="Madi hah";
        names[5]="Fati ma";
        names[6]="Hi bba";
        names[7]="Su nia";
        names[8]="Min ahil";
        names[9]="Nim ra";
        System.out.println(Arrays.toString(names));


        for (int i = 0; i < names.length; i++) {
            String name= names[i].charAt(0)+"."+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(name);
        }

        for (String each : names) {
            String initial= each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);

        }
        /*

        for (int i = 0; i < names.length; i++) {

            String name=names[i].charAt(0)+"."+names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(name);

            }

        for (String name : names) {
            String initial=name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1);



        }


         */

        }


    }
