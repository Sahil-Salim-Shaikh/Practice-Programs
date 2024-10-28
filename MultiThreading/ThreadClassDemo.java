/**
 * ThreadClassDemo
 */
public class ThreadClassDemo extends Thread {
    public void run()
    {
       for (int i = 0; i <10; i++) {
        System.out.println("thread execution");
        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
       } 
    }

    public static void main(String[] args) {
        ThreadClassDemo t=new ThreadClassDemo();
        
        
        t.start();
    }
}