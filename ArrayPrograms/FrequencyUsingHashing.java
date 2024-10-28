import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingHashing {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5,5, 1};

        HashMap<Integer,Integer> Hs=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (Hs.containsKey(arr[i])) {
                Hs.put(arr[i],Hs.get(arr[i])+1);
            }
            else{
                Hs.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> i: Hs.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
    
}
