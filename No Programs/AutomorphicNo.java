// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number
public class AutomorphicNo {
    static boolean isAutomorphicNo(int n)
    {
        int square=n*n;
        int lastno=square%100;

        if (lastno==n) {
            return true;
            
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isAutomorphicNo(24));
        for (int i = 1; i <100; i++) {
            if (isAutomorphicNo(i)) {
                System.err.println(i);
            }
        }
    }
}
