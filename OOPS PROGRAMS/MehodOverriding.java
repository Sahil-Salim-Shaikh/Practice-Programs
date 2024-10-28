
class parent{

    public void show()
    {
        System.out.println("parent mehod called");
    }
}
public class MehodOverriding extends parent{
    public void show()
    {
        System.out.println("child mehtod called");
    }
    public static void main(String[] args) {
        MehodOverriding c=new MehodOverriding();
        c.show();
        
    }
}



