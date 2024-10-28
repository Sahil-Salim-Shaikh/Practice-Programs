/*
15	14	13	12	11
10	9	8	7
6	5	4	
3	2
1
*/

class Pattern2
{
	public static void main(String args[])
	{
		int n=5;
		int count=n*(n+1)/2;
		
	
		for(int i=n;i>=1;i--)
		{     
			
			
			for(int j=1;j<=i;j++)
			{	
				System.out.print(count+"\t");
				count--;
				

			}
		System.out.println();
		 
			
                      
		}
		
		
	}

}