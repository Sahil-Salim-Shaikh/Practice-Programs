public class ShiftVovelsAtBegining {
    public static void main(String[] args) {
        String s1="International";
        String constant="";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s1.length(); i++) {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u'||s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I'|| s1.charAt(i)=='O'|| s1.charAt(i)=='U' )
            {
                sb.append(s1.charAt(i));
            }
            else{
                constant+=s1.charAt(i);
            }
           
        }
        sb.append(constant);
        System.out.println(sb);

    }
}
