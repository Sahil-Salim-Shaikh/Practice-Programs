public class CaptilizeVowelsInString {
    public static void main(String[] args) {
        String s="Education";//EdUcAtIOn 13578
        String vowels="AEIOUaeiou";
        StringBuilder sb=new StringBuilder();
        StringBuilder num=new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
             if (vowels.contains(String.valueOf(s.charAt(i))))
              {
                
                sb.append(Character.toUpperCase(s.charAt(i)));
                num.append(i+1);
             }else
             {
                sb.append(s.charAt(i));
             }
            
            
        }
        sb.append(" ");
        sb.append(num);
        
        System.out.println(sb);


    }
}
