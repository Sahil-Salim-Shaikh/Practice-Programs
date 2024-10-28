class counter{
    static int counter=0;
    counter()
    {
        counter++;
        System.out.println(counter);
    }
}
public class StaticDemoCounter {
    public static void main(String[] args) {
        counter c=new counter();
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
    }
}
