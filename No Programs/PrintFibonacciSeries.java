import java.util.Arrays;

/**
 * PrintFibonacciSeries
 * Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 
 */
public class PrintFibonacciSeries {

    static int[] printFabonachiseries(int last)
    {
        int f[]=new int[last+1];
        f[0]=0;
        f[1]=1;
        for (int i = 2; i <=last; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        
        return f;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFabonachiseries(10)));
    }
}