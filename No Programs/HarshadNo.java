// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

 public class HarshadNo {
    static boolean isHarshad(int n)
    {
        int sum=0;
        int original=n;
        while (n>0) {
           int last=n%10;
            sum+=last;
            n=n/10;
            
        }
        if (original%sum==0) {
            return true;
            
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n=379;
        
        System.out.println(isHarshad(n));

        for (int i = 1; i<=100; i++) {
            if (isHarshad(i)) {
                System.out.println(i);
                
            }
            
        }
    }
}
