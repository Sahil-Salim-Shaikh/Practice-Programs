// Number = 145
// 145 = !1 + !4 + !5

// =1+4*3*2*1+5*4*3*2*1

// =1+24+120

// 145=145
public class PetersonNo {

    
    public static void main(String[] args) {
        int n=14;
        int temp=n;
        int sum=0;
        
        while (n>0) {
           int last=n%10;
            int fact=1;
        
        for (int i = 1; i <=last; i++) {
            fact=fact*i;
        }
        sum+=fact;
        n=n/10;

        }

        if (sum==temp) {
            System.out.println("The no is peterson no "+sum);
        }
        else{
            System.out.println("not peterson");
        }
        
    }
    
}
