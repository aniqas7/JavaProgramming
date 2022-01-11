package day14_stringmethod;

import practice.JavaComponents;

public class stringmethod {
    public static void main(String[] args) {

        String str= "Java is fun, I love learning Java";
        String str2= str.replace("Java", "Python");

        System.out.println("str= "+ str);
        System.out.println("str2= "+ str2);

        String email= "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "Gmail");
        System.out.println("email= "+ email);

        String sentence= "Java Java Python C# C# C++ C++ Python Python Python";
        sentence= sentence.replace("Python","");
        sentence= sentence.replace("  ", " ");
        System.out.println("sentence= "+sentence);

        String s= "Dog Dog Dog Dog Dog Dog";
        s= s.replace("dog","cat");

        String s2="C# is fun, C# is cool";
        s2= s2.replace(" C#", " Java");
        System.out.println(s2);

        String s3= "Java";
        s3=s3.replace("a", "e");
        System.out.println(s3);

        String s4= "Java Java Java";
        s4= s4.replaceFirst("Java", "Python");
        System.out.println(s4);

        String result= "C# is fun, C# is cool";
        result= result.replaceFirst("C#", "Java");
        System.out.println(result);

        String result2= "Java";
        result2= result2.replaceFirst("va","vo");
        System.out.println(result2);


    }
}
