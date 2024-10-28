public class ShiftLastCharToFirst {
    public static void main(String[] args) {
        String s1="India";//aIndi
        StringBuilder Sb=new StringBuilder();
        Sb.append(s1.charAt(s1.length()-1));
        for (int i = 0; i < s1.length()-1; i++) {
            Sb.append(s1.charAt(i));
        }

        System.out.println(Sb);

    }
}
