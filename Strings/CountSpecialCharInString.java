public class CountSpecialCharInString {
    public static void main(String[] args) {
        String s="hello?? how are you? i am fine!!";//5
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
           if (!Character.isLetterOrDigit(c)&& !Character.isWhitespace(c)) {
            count++;
           }
        }
        System.out.println(count);
    }
}
