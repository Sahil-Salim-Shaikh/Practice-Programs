/*
    k
   GL
  DHM
 BEIN
ACFJO
*/

class Pattern9
{
	public static void main(String args[])
	{
		int n=5;
		int count=11;
		
	
		for(int i=n;i>=1;i--)
		{     
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			 
			int c=count;
			for(int j=i;j<=n;j++)
			{	
				System.out.print((char)(64+c));
				c+=j+1;
				

			}
		System.out.println();
      			count-=i-1;
		    
			
                      
		}
		
		
	}

}