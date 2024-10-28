public class GcdOfTwoNo {
    public static int findGcd(int n,int n2)
    {
        int gcd=0;
        for (int i = 1; i <Math.min(n2, n); i++) {
            if (n%i==0 && n2%i==0) {
                gcd=i;
                
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(findGcd(9, 12));
    }
}
