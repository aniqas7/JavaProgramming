package practice;

public class numberOfDays {
    public static void main(String[] args) {

        int m= 1;

        boolean twentyeightdays= m==2;
        boolean thirtydays= m==4 || m==6 || m==9 || m==11;
        boolean thirtyonedays= m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==11 || m==12;

        if (twentyeightdays){
            System.out.println("has 28 days");
        }

        if (thirtydays){
            System.out.println("has 30 days");
        }

        if (thirtyonedays){
            System.out.println("has 31 days");
        }

    }
}
