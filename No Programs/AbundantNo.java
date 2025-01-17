// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

public class AbundantNo {
    static boolean isAbundant(int n)
    {
        int sum=0;
        for (int i = 1; i <n; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        if (sum>n) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isAbundant(18));
    }
}
