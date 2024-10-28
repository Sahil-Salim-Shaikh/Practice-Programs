import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String s="i am java developer";
        String s1[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        //System.out.println(Arrays.toString(s1));
        for (int i = s1.length-1; i>=0 ; i--) {
            sb.append(s1[i]);
            if(i<s1.length)
            {
                sb.append(" ");
            }
            
        }
        System.out.println(sb);
    }
}
