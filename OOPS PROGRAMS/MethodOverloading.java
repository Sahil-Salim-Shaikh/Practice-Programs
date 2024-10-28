public class MethodOverloading {
    public void show()
    {
        System.out.println("method 1");
    }
    public void show(int a)
    {
        System.out.println("a :"+a);
    }
    public void show(String a)
    {
        System.out.println(a+" string method");
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.show();
        m.show("sahil");
        m.show(10);
    }
}
