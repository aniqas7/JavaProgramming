package practice;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] names = new String[10];
        names[0] = "Aniqa";
        names[1] = "Mamona";
        names[2] = "Jannat";
        names[3] = "Aroosha";
        names[4] = "Madihah";
        names[5] = "Fatima";
        names[6] = "Hibba";
        names[7] = "Sunia";
        names[8] = "Minahil";
        names[9] = "Nimra";

        String name1 = Arrays.toString(names);
        //System.out.println(name1);


        for (int i = 0; i <=names.length-1 ; i++) {

            String name = names[i];
            String reverse = "";
            for (int j = name.length()-1; j >= 0; j--) {

                char ch = name.charAt(j);
                reverse += ch+"";

            }
            System.out.println(reverse);
            }


        }

/*
            for (int  i = names.length-1 ; i >= 0; i--) {

                System.out.print(names[i].charAt(i));
            }
        }

 */

        }



/*
for (int i = names.length - 1; i >= 0; i--) {

               char ch =names[i].charAt(i);
                reverse+=ch;
 */