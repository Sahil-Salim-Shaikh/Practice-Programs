import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class IteratorDemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(1);
        l.add(25);
        l.add(85);
        l.add(89);

         System.out.println(l);
        // Iterator i=l.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        ListIterator li=l.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

    System.out.println("-----------------------------------------------------");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }


    }
}
