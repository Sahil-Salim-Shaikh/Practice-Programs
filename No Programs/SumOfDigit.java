/**
 * SumOfDigit
 */
public class SumOfDigit {

    public static void main(String[] args) {
        int n=1234;
        int sum=0;

        while (n>0) {
            sum+=n%10;
           // System.out.println(sum);
            n=n/10;
           // System.out.println(n);

        }
        System.out.println(sum);
    }
}