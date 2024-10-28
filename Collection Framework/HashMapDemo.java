import java.util.*;
import java.util.Set;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(10, "sahil");
        hs.put(56, "abc");
        hs.put(58, "sultan");
        System.out.println(hs);

    //    Set set= hs.entrySet();
    //    System.out.println(set);

    //    Iterator itr=set.iterator();
    //    while (itr.hasNext()) {
    //     System.out.println(itr.next());
    //    }

    for(Map.Entry<Integer,String> e:hs.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());

    }





    }
}
