public class ThreadCase1 extends Thread {
 // Perfoming single task from multiple thread 

 public void run()
 {
    for (int i = 0; i <10; i++) {
        System.out.println(Thread.currentThread().getName());
    }
   
 }
 public static void main(String[] args) {
    ThreadCase1 t=new ThreadCase1();
    t.setName("sahil");
    t.start();
    ThreadCase1 t2=new ThreadCase1();
    t2.setName("sultan");
    t2.start();

 }
}
