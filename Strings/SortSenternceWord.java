import java.util.Arrays;

public class SortSenternceWord {
    public static void main(String[] args) {
        String s="i am java developer";
        String s1[]=s.split(" ");
        Arrays.sort(s1);
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]);
            if(i<s1.length)
            {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
