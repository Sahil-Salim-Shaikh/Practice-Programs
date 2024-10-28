public class EmirpNo {

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        int n = 99;  // Change this to test with different numbers
        int og = n;
        int rev = 0;

        if (isPrime(n)) {
            while (n > 0) {
                int last = n % 10;
                rev = rev * 10 + last;
                n = n / 10;
            }
        }

        if (isPrime(rev) && isPrime(og)) {
            System.out.println(og + " is an emirp number");
        } else {
            System.out.println(og + " is not an emirp number");
        }
    }
}
