public class MaxAndMinNoInDigit {
//     Example 1:
// Input: N = 2746
// Output: Largest digit: 7
//         Smallest digit: 2

public static void main(String[] args) {
    int n=123;
    int lastdigit;
    int MinValue=Integer.MAX_VALUE;
    int MaxValue=Integer.MIN_VALUE;
    while (n>0) {
        lastdigit=n%10;
        if (lastdigit>MaxValue) {
            MaxValue=lastdigit;
        }
        if (lastdigit<MinValue) {
            MinValue=lastdigit;
        }
        n=n/10;
    }
    System.out.println(MinValue);
    System.out.println(MaxValue);
}
}
