package practice;

public class medianNumber {
    public static void main(String[] args) {

        int a=10; //a=25
        int b=25; //b=10
        int c=20; //c=20

        if(a>b&&c>a || a>c&&b>a){
            System.out.println("A is median");
        }
        if(b>a&&b<c || b<a&&b>c){
            System.out.println("B is median");
        }
        if(c>a&&c<b || c>b&&c<a){
            System.out.println("C is median");
        }
    }
}
