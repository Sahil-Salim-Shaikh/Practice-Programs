public class PrintDigitFromWord {
    public static void main(String[] args) {
        String s="first 1985 second 7856";//1985 7856
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));

            }
            if(i<s.length())
            {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
