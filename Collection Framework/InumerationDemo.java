import java.util.Enumeration;
import java.util.Vector;

/**
 * InumerationDemo
 */
public class InumerationDemo {

    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add("sahil");
        v.add("shaikh");
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}