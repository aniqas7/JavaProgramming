package custommethodsarraypractice;

public class frequencyofword {
    public static void main(String[] args) {

        int frequency = frequencyofword("Java java java python python", "java");

        System.out.println(frequency);

    }

    public static int frequencyofword(String sentence, String word) {

        int count = 0;
        String[] words = sentence.split(" ");

        for (String each : words) {

            if (each.equals("java")) {
                count++;
            }

        }return count;
    }
}



/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


 */


