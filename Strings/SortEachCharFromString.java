import java.util.Arrays;

public class SortEachCharFromString {
    public static void main(String[] args) {
        String s1="International";
        char c []=s1.toCharArray();
        for (int i = 0; i <c.length; i++) {
            char temp;
            for (int j =i+1; j < c.length; j++) {
                if (c[i]>c[j]) {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
