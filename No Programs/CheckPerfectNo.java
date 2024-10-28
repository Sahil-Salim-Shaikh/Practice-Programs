/*Example 1:

n = 9
Proper Divisors of 9 are 1 and 3.
Sum = 1+3 = 4 ≠ 9
⇒ 9 is not a perfect number.

Example 2:

n = 6
Proper Divisors of 6 are 1, 2 and 3.
Sum = 1+2+3 = 6 = 6
⇒ 6 is a perfect number*/

public class CheckPerfectNo {
    static boolean isPerfect(int n)
    {
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sum+=i;
                
            }
        }
        if (sum==n) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // int n=6;
        // System.out.println(isPerfect(n));
        int start=1;
        int end=50;
        for (int i = start; i <=end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
