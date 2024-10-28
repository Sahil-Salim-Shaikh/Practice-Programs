/*
    O
   NM
  LKJ
 IHGF
EDCBA
*/

class Pattern2
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		
	
		for(int i=1;i<=n;i++)
		{     
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{	
				System.out.print((char)(80-count));
				count++;
				

			}
		System.out.println();
		    
			
                      
		}
		
		
	}

}