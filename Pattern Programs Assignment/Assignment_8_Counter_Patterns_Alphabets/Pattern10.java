/*
    O
   JN
  FIM
 CEHL
ABDGK
*/

class Pattern10
{
	public static void main(String args[])
	{
		int n=5;
		int count=15;
		
	
		for(int i=n;i>=1;i--)
		{     
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			 
			int c=count;
			for(int j=i;j<=n;j++)
			{	
				System.out.print((char)(c+64));
				c+=j;
				

			}
		System.out.println();
      			count-=i;
		    
			
                      
		}
		
		
	}

}