import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(30);
        al.add(10);
        al.add(30);
        al.add(30);
        System.out.println(al);
        ArrayList al2=new ArrayList<>();
        al2.add(al);
        System.out.println(al2);
        Iterator itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
 