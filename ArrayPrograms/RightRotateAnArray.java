public class RightRotateAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       int n= arr.length;
       
      int  k=3;

       for (int j = 0; j < k; j++) {
        int last=arr[n-1];

        for (int i = n-1; i > 0; i--) {
            arr[i]=arr[i-1];
    
                  
           }
           arr[0]=last;

       }
       
       
       for (int i = 0; i < n; i++) {
        System.out.print(arr[i]);
        
       }

    }
}
