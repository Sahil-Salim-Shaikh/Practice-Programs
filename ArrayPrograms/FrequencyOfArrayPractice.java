public class FrequencyOfArrayPractice {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        int freq[]=new int[arr.length];
        int visited=-1;
        for (int i = 0; i < freq.length; i++) {
            int count=1;
            for (int j = i+1; j < freq.length; j++) {
                if(arr[i]==arr[j])
                {
                    freq[j]=visited;
                    count++;

                }
                if (freq[i]!=visited) {
                    freq[i]=count;
                }
            }
           
            
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]!=visited) {
                System.out.println(arr[i]+" "+freq[i]);  
            }
        }
    }
}
