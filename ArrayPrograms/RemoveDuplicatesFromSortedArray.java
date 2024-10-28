import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr []={1,1,2,2,2,3,3,5};
        HashSet <Integer> Hs=new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Hs.add(arr[i]);
        }
        int k=Hs.size();

        System.out.println(Hs);
        System.out.println(k);





    }
}
