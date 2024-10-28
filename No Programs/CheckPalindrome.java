public class CheckPalindrome {
    public static void main(String[] args) {
        int n=123;
        int n2=32;

        int reverse=0;
        while (n>0) {
          int r=n%10;
          reverse=reverse*10+r;
          n=n/10;
        }
        if (reverse==n2) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
