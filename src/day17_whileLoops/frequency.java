package day17_whileLoops;

public class frequency {
    public static void main(String[] args) {
        String str= "Java Java Python Python";

        int frequency=0;
        while(str.contains("Java")){
            str=str.replaceFirst("Java","");
            frequency++;
        }
    }
}
