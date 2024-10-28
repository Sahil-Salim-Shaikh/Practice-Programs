public class ThrowDemo {
    public static void main(String[] args) {
        int age=19;
        if (age<18) {
            throw new YoungerAgeException("you are not eligible to vote");
        }else{
            System.out.println("you can vote");
        }
    }
    
}
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}
