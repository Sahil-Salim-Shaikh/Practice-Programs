import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(60);
        hs.add(36);
        hs.add(10);
        hs.add("sahil");
        for (Object e : hs) {
            System.out.println(e);
        }
        System.out.println(hs);
    }
}
