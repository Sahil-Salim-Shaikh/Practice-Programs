public class SecondSmallestElement {
    public static void main(String[] args) {
        int a[]={5,4,5,1,8,7};
        int small=Integer.MAX_VALUE;
        int SecondSmallestElement=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<small)
            {
                SecondSmallestElement=small;4
                small=a[i];1

            }
            if(a[i]<SecondSmallestElement && a[i]!=small )
            {
                SecondSmallestElement=a[i];
            }
        }
        System.out.println(small);
        System.out.println(SecondSmallestElement);
    }
}
