/*
EDCBA
 IHGF
  LKJ
   NM
    O
*/

class Pattern15
{
	public static void main(String args[])
	{
		int n=5;
		int count=5;
		
	
		for(int i=n;i>=1;i--)
		{     
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			 
			int c=count;
			for(int j=1;j<=i;j++)
			{	
				System.out.print((char)(64+c));
				c--;
				

			}
		System.out.println();
      			count+=i-1;
		    
			
                      
		}
		
		
	}

}