public class SmallestElementInArray {
    public static void main(String[] args) {
        int a[]={2,5,4,5,1,8,7};
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
