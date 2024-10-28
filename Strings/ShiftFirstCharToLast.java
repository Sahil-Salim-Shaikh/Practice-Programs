/**
 * ShiftFirstCharToLast
 */
public class ShiftFirstCharToLast {

    public static void main(String[] args) {
        String S1="India";//ndiaI
        StringBuilder sb=new StringBuilder();

        for (int i = 1; i < S1.length(); i++) {
            sb.append(S1.charAt(i));
        }
        sb.append(S1.charAt(0));
        System.out.println(sb.toString());
    }
}