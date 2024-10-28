package Case3;

public class Video extends Thread {
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("video Playing");
        }
        
    }
}
