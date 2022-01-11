package day18_nestedloop;

public class day18_NestedLoop {
    public static void main(String[] args) {
        int a= 30;
        int b=7;
        int count=0;

        while(a>b){
            a-=b;
            count++;
        }
        System.out.println(a); //remainder
        System.out.println(count); //division product
    }
}
