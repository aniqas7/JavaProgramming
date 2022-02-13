package day42_Exceptions;
//custom unchecked exception
class FadyException extends RuntimeException{

    public FadyException(String message){
        super(message);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        throw new FadyException("short break");
    }
}
//custom checked exception
class noBreakException extends Exception{

}
