import java.io.IOException;
class DemouserThrow
{
    public void show()throws IOException
    {
        
        throw new IOException("device error");//checked exception  
    }
}
public class ThrowsDemo {
    
    public static void main(String[] args) throws ArithmeticException {
        DemouserThrow d=new DemouserThrow();
        try {
            d.show();
        } catch (Exception e) {
            
            System.out.println(e);
        }
       
   
       
    
    
        System.out.println("program ended");
    }
}

    