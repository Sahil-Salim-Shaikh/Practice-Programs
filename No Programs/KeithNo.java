public class KeithNo {
    public static void main(String[] args) {
        int n=742;
        int sum=0;
        while (n>0) {
            int n1=n%10;
             sum+=n1;
             n=n/10;

        }
        System.out.println(sum);
    }
}
