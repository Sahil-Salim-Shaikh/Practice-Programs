/**
 * ExceptionDemo
 */
public class ExceptionDemo {
public static void main(String[] args) throws ArithmeticException {
    //compile time or checked exception
System.out.println("program started");
   // Class.forName("com.mysql");


   //unchecked exception or runtime exception

   int a=100;
   int b=0;
   try{
   int c=a/b;
   }catch(ArithmeticException e)
   {
    System.out.println(e);
   }


    System.out.println("program ended");
}
    
}