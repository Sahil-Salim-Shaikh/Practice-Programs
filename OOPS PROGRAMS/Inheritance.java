class parent 
{
    public void show()
    {
        System.out.print("parent method called");
    }
}

/**
 * Inheritance
 */
public class Inheritance extends parent{

    public static void main(String[] args) {
        parent p=new parent();
       // p.show();
        Inheritance i=new Inheritance();
        i.show();
    }
}