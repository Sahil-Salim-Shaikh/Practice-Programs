// Example 1:
// Input: N=60
// Output: 2, 3, 5
// Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
public class PrimeFactorOfGivenNumber {

    static boolean isPrime(int n)
    {
        int count=0;
        for (int i = 1; i <=n; i++) 
        {
           
            if (n%i==0) {
                count++;
            }
           
            
        }
        if (count==2) {
            return true;
            
           }else{
            return false;
           }
    }

    static void isprimeFactor(int n)
    {
       for (int i =1; i <=n; i++) {
            if (n%i==0 && isPrime(i)) {
                System.out.println(i);
            }
       }
    }

    public static void main(String[] args) {
        int n=60;
        isprimeFactor(n);

        

    }
}
