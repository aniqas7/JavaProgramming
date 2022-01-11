package day17_whileLoops;

public class branchingstatements2 {
    public static void main(String[] args) {
        for(char i='A'; i<='E'; i++){
            if(i=='C'){
                continue;
            }
            System.out.println(i);
        }
    }
}
