public class FrequencyOfArrayPracticeUsingBoolean3 {
     
        public static void main(String[] args) {  
            //Initialize array  
            int [] arr = new int [] {1, 2, 8, 3,3, 2, 2, 2, 5, 1}; 
            
            boolean [] freq=new boolean[arr.length];
            
            for (int i = 0; i < freq.length; i++) {

                if (freq[i]==true) 
                continue;

                int count=1;

                for (int j = i+1; j < freq.length; j++) {
                    if (arr[i]==arr[j]) {
                        freq[j]=true;
                        count++;
                    }

                   
                    

                    
                }
               
                System.out.println(arr[i]+" "+ count);


            }
        }
    }