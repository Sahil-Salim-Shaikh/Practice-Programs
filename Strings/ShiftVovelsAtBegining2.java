/**
 * ShiftVovelsAtBegining2
 */
public class ShiftVovelsAtBegining2 {

    public static void main(String[] args) {
        String s="International";
        String vowels="AEIOUaeiou";
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        char c[]=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(vowels.contains(String.valueOf(c[i])))
            {
                sb.append(c[i]);

            }
            else
            {
                sb2.append(c[i]);
            }

        }
        sb.append(sb2);
        System.out.println(sb);
    }
}