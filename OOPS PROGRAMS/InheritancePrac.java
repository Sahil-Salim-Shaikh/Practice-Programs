interface Vehicle{
    abstract void tyre();
    abstract void engine();
}

class bike implements Vehicle{
    public void tyre()
    {
        System.out.println("runs on two tyres");
    }

    public void engine()
    {
        System.out.println("has 125 cc engine ");
    }
}
public class InheritancePrac {
    public static void main(String[] args) {
        bike b=new bike();
        b.tyre();
        b.engine();
    }
   
}
