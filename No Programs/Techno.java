// Input: n = 81
// Output: True
// Explanation: 8 + 1 = 9 and 92 = 81
public class Techno {
    public static void main(String[] args) {
    
        int n=2025;
        int originalno=n;

        int length=String.valueOf(n).length();

        int divisor=(int )Math.pow(10, length/2);

        int firstno=n/divisor;
        
        int secondno=n%divisor;

        int sum=firstno+secondno;
    
        if (sum*sum==originalno) {
            System.out.println(originalno+" is Tech no");
        }
        else{
            System.out.println(originalno+" Not Tech no");
        }



        
    
}
}
