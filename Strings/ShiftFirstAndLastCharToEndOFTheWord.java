/**
 * ShiftFirstAndLastCharToEndOFTheWord 
 */
public class ShiftFirstAndLastCharToEndOFTheWord {
public static void main(String[] args) {
    String s="hello i am java developer";//elloho i am avja evelopedr
        String s1[]=s.split(" ");
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < s1.length; i++) {
            String temp=s1[i];
            if(temp.length()>1)
            {
            sb.append(temp.substring(1,temp.length()-1));
            sb.append(temp.charAt(0));
            }
            
            sb.append(temp.charAt(temp.length()-1));

            if(i<s1.length)
            {
                sb.append(" ");
            }
        }

        System.out.println(sb);
}
    
}