/*
    A
   BF
  CGJ
 DHKM
EILNO
*/

class Pattern5
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		
	
		for(int i=n;i>=1;i--)
		{     
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			 
			int c=count;
			for(int j=n;j>=i;j--)
			{	
				System.out.print((char)(64+c));
				c+=j-1;
				

			}
		System.out.println();
      			count++;
		    
			
                      
		}
		
		
	}

}