/*
ACFJO
 BEIN
  DHM
   GL
    K
*/

class Pattern21
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		
	
		for(int i=1;i<=n;i++)
		{     
			for(int k=1;k<i;k++)
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
      			count+=i;
		    
			
                      
		}
		
		
	}

}