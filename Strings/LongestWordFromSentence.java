public class LongestWordFromSentence {
    public static void main(String[] args) {
        String s1="welcome to international airport";
        String s2[]=s1.split(" ");
        String maxword="";
        for (int i = 0; i < s2.length; i++) {
            if(s2[i].length()>maxword.length())
            {
                maxword=s2[i];

            }
        }
        System.out.println(maxword);
        
    }
}
