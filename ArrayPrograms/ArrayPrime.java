/**
 * ArrayPrime
 */
public class ArrayPrime {

    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,4,5,65,4,7,11};
       
        for (int i = 0; i <arr.length; i++) {
            
            int count=0;
            for (int j = 1; j <=arr[i]; j++)
             {
                
             if(arr[i]%j==0)
            {
                count++;
            }
           
           
            }
            if(count==2)
            {
                System.out.println(arr[i]+" is prime no");
            }
        }
        
    }
    



}