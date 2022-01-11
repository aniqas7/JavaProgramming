package ConstructorPractice;

public class movieObjects {
    public static void main(String[] args) {
        movie movie1=new movie("USA","Journey to SDET", "Adventure, Comedy", "10,25/2021","Kuzzat Altay");
        //String[]cast={"Asiya","Adam","Muhtar", "Mixa", "Fady", "Sandra", "Tatiana", "Dunya"};
        //movie1.addCasts(cast);
        String str= "hello";
        movie1.addCast(str);

        System.out.println(movie1);
    }
}
