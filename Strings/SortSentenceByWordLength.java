import java.util.Arrays;

public class SortSentenceByWordLength {
    public static void main(String[] args) {
        String s="hello i am a senior java developer";
        String s1[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        
        for (int i = 0; i < s1.length-1; i++) {
            for (int j = i+1; j < s1.length; j++) {
                if(s1[i].length()>s1[j].length())
                {
                    String temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
            
        }
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]);
            if(i<s1.length-1)
            {
                sb.append(" ");
            }
            
        }
        System.out.println(sb);
        

    }
}
