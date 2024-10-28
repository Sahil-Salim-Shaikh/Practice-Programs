public class CheckEvenOROdd {
    static boolean isEven(int n)
    {
        if (n%2==0) {
            return true;
            
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // int n=1;
        // System.out.println(isEven(n));

        //even or odd in given range
        int start=1;
        int end=20;
        for (int i = start; i <= end; i++) {
            if (isEven(i)) {
                System.out.println("Even no = "+i);
            }
            else{
                System.out.println("Odd no = "+i );
            }
        }


    }
    
}
