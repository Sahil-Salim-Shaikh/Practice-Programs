/*
    O
   NJ
  MIF
 LHEC
KGDBA
*/

class Pattern8
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
			for(int j=n;j>=i;j--)
			{	
				System.out.print((char)(c+64));
				c-=j-1;
				

			}
		System.out.println();
      			count--;
		    
			
                      
		}
		
		
	}

}