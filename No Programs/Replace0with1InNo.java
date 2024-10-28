public class Replace0with1InNo {
    public static void main(String[] args) {
        int n=1203;
        int r=0;
        while (n>0) {
           int last=n%10;
           if (last==0) {
            last=1; 
           }
           r=10*r+last;
           n=n/10;
           
        }
        
        int temp=0;
       while (r>0) {
        temp=temp*10+(r%10);
        r=r/10;
       }
        System.out.println(temp);
    }
}
