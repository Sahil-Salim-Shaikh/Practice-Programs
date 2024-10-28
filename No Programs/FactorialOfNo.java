public class FactorialOfNo {
    // Input: X = 5
    // Output: 120
    // Explanation: 5! = 5*4*3*2*1

    static int factorial(int n)
    {
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
