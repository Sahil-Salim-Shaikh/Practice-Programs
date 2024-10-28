/*
OJFCA
 NIEB
  MHD
   LG
    K
*/

class Pattern19
{
	public static void main(String args[])
	{
		int n=5;
		int count=15;
		
	
		for(int i=1;i<=n;i++)
		{     
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			 
			int c=count;
			for(int j=n;j>=i;j--)
			{	
				System.out.print((char)(64+c));
				c-=j;
				

			}
		System.out.println();
      			count--;
		    
			
                      
		}
		
		
	}

}