class Demo{
    public static void show()
    {
        System.out.println("showing method of demo class");
    }
}
public class StaticMehod {

    static void showinner()
    {
        System.out.println("inner show method");
    }
    public static void main(String[] args) {
        // Demo d=new Demo();
        // d.show();

        Demo.show();
        showinner ();
    }
}
