package practice;

public interface Test {
   void readBook();
   abstract void watchTV();
    }

    abstract class B implements Test{
    public void readBook(){
        System.out.println("reading book");


        }

}
