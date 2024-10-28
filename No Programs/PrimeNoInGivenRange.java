public class PrimeNoInGivenRange {

    static boolean isPrime(int n)
    {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
                count++;
            }
            
        }
        if (count==2) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int start=1;
        int end=20;

        for (int i = start; i <=end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            
        }


    }
}
