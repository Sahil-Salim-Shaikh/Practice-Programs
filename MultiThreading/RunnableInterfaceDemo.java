public class RunnableInterfaceDemo implements Runnable {

    public void run()
    {
        System.out.println("thread execution");
    }
    public static void main(String[] args) {
        RunnableInterfaceDemo r=new RunnableInterfaceDemo();
        Thread t=new Thread(r);
        t.start();
    }
}
