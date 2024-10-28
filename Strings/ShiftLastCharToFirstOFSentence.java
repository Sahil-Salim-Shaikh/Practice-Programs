//shift last char of word in sentence to first
public class ShiftLastCharToFirstOFSentence {
    public static void main(String[] args) {
        String s="hello i am java developer";//ohell i ma ajav rdevelope
        String s1[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length;i++)
        {
            String temp=s1[i];
            sb.append(temp.substring(temp.length()-1));
            sb.append(temp.substring(0,temp.length()-1));
            if(i<s1.length-1)
            {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
