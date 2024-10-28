public class PalindromeInGivenRange {


    static boolean isPalindrome(int temp)
    {
        int reverse=0;
        int n=temp;
        while (n>0) {
           int r=n%10;
            reverse=reverse*10+r;
            n=n/10;

            
        }
        if (temp==reverse) {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
      // System.out.println(isPalindrome(1221));
        int start=100;
        int end=200;
        for (int i = start; i <=end; i++) {
           if( isPalindrome(i))
           {
            System.out.println(i);
           }
        }
    
    }
}
