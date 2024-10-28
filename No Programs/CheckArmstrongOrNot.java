// 1: 11 = 1

// 2: 21 = 2

// 3: 31 = 3

// 153: 13 + 53 + 33 = 1 + 125+ 27 = 153

// 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

// 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
public class CheckArmstrongOrNot {

    static boolean isArmstrong(int n)
    {
        int digitLength=String.valueOf(n).length();
        int no=n;
        int temp;
        int sum=0;
        while (no>0) {
            temp=no%10;
            sum+=Math.pow(temp,digitLength);
            no=no/10;
            
        }
        if (sum==n) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n=370;
        int start=1;
        int end=500;
        //print Armstrong in given range
        for (int i = start; i <=end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        // if (isArmstrong(n)) {
        //     System.out.println(n+" is Armstrong number");
        // }
        // else{
        //     System.out.println(n+" is not Armstrong number");
        // }
    }
}
