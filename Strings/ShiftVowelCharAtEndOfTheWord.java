public class ShiftVowelCharAtEndOfTheWord {
    public static void main(String[] args) {
        String s="i am java developer";//i ma jvaa dvlpreeoe
        String s1[]=s.split(" ");
        String vowels="AEIOUaeiou";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s1.length; i++) 
        {
            String temp=s1[i];
            StringBuilder vow=new StringBuilder();
            for (int j = 0; j < temp.length(); j++) 
            {
                if(!vowels.contains(String.valueOf(temp.charAt(j))))
                {
                     sb.append(temp.charAt(j));
                }else 
                {
                     vow.append(temp.charAt(j));
                }
            }
            sb.append(vow);
                
               if(i<s1.length-1)
               {
                sb.append(" ");
               }
            
            
        }
        
        System.out.println(sb);

    }
}
