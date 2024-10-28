abstract class vehicle {

     abstract void start();
     public void stop()
     {
         System.out.println("stop with break");
     }
}

public class AbstracClass extends vehicle {
    public void start()
    {
        System.out.println("start wiht key");
    }
    public static void main(String[] args) {
       AbstracClass bike=new AbstracClass();
       bike.start();
       bike.stop();
    }
}
