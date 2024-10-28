public class ReplaceCountWithVowelReverse {
    public static void main(String[] args) {
        String s1="sahil";//s2h1l
        int count=0;
        for (int i = s1.length()-1; i>=0; i--) {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
            {
                count++;
                System.out.print(count);

            }
            else
            {
                System.out.print(s1.charAt(i));
            }
        }
    
    }
}
