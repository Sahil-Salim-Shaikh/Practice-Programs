public class LcmOfTwoNo {
    public static int findGcd(int n,int n2)
    {
        int gcd=1;
        for (int i = 1; i <=Math.min(n2, n); i++) {
            if (n%i==0 && n2%i==0) {
                gcd=i;
                
            }
        }
        return gcd;
    }

    public static int findLcm(int a,int b)
    {
        int lcm=(a*b)/findGcd(a, b);
        return lcm;
    }
    public static void main(String[] args) {
        //Lcm(a,b)=a*b/gcd(a,b)
        System.out.println(findLcm(4, 8));
        System.out.println("LCM of 4 and 8 is: " + findLcm(4, 8));
        System.out.println("LCM of 12 and 15 is: " + findLcm(12, 15)); // Additional test
        System.out.println("LCM of 21 and 14 is: " + findLcm(21, 14));

    }
}
