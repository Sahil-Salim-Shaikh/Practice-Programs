/*
    O
   MN
  JKL
 FGHI
ABCDE
*/

class Pattern4
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
			 
			int c=count;
			for(int j=1;j<=i;j++)
			{	
				System.out.print((char)(80-c));
				c--;
				

			}
		System.out.println();
      			count+=i+1;
		    
			
                      
		}
		
		
	}

}