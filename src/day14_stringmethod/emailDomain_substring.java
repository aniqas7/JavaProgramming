package day14_stringmethod;

public class emailDomain_substring {
    public static void main(String[] args) {

        String email= "johndoe@gmail.com";

        int beginningIndex= email.indexOf("@")+1;
        int endingIndex= email.lastIndexOf(".");
        String domain= email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        String str1= "Java is fun, Java is cool, I love Java";

        String s1=str1.substring(0, 10+1);
        System.out.println(s1);

        String s2; //Java is cool

        int beg= str1.indexOf(" J")+1;
        int end= str1.lastIndexOf(",");
       s2=str1.substring(beg, end);
        System.out.println(s2);

        String s3;
        int beg1= str1.indexOf("I");
        s3= str1.substring(beg1);
        System.out.println(s3);



    }
}
