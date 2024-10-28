/*
    A
   BC
  DEF
 GHIJ
KLMNO
*/

class Pattern1
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
				System.out.print((char)(64+count));
				count++;
				

			}
		System.out.println();
		    
			
                      
		}
		
		
	}

}