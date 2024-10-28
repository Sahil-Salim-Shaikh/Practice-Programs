package Case3;

public class MainClass {
    public static void main(String[] args) {
        Video v=new Video();
        
        v.start();
       
        Music m=new Music();
        m.setPriority(10);
        m.start();
        Volume vol=new Volume();
        vol.start();
        

    }
}
