public class ReverseArray2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int start=0;
        int end=a.length-1;
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;

            
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
