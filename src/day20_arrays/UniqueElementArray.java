package day20_arrays;

public class UniqueElementArray {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};


        for (int j = 0; j < words.length; j++) {


            String element = words[j]; //Java
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);

            }

        }

    }
}

