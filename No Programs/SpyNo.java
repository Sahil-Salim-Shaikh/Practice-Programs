public class SpyNo {
    public static void main(String[] args) {
        //A positive integer is called a spy number if the sum and product of its digits are equal

        int n=217;
        int originat=n;
        int sum=0;
        int product=1;
        while (n>0) {
            int last=n%10;
            sum+=last;
            product=product*last;
            n/=10;


        }
        System.out.println(product);
        System.out.println(sum);
        if (product==sum) {
            System.out.println(originat+" is spy no");
        }
        else{
            System.out.println(originat+ "is not spy no");
        }
    }
}
