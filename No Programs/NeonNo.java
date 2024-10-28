public class NeonNo {
    public static void main(String[] args) {
        int n=9;
        int square=n*n;
        int sum=0;
        while (square>0) {
            int last=square%10;
            sum+=last;
            square=square/10;
            
        }
        
        if (sum==n) {
            System.out.println(n+" is neon no");
        }
        else{
            System.out.println(n+" is not neon no");
        }
    }
}
