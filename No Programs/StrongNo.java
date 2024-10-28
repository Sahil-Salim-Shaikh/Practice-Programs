// Example 2:
// Input:  26
// Output: No
// Explanation: 2! + 6! = 722. Hence 26 is not a strong number.
public class StrongNo {

    static int factorial(int n)
    {
        int fact=1;
         for (int i = 1; i <=n; i++) {
            fact=fact*i;
         }
         return fact;
    }

    static boolean isStrong(int n)
    {   int sum=0;
        int last=0;
        int originaln=n;
        while (n>0) {
            last=n%10;
            sum+=factorial(last);
            n=n/10;
        }
        if (sum==originaln) {
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        
        for (int i = 1; i <=200; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
        
       
    }
}
