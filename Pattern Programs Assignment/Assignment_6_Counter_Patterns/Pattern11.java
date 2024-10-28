/*
11	
7	12
4	8	13
2	5	9	14
1	3	6	10	15
*/

class Pattern11
{
	public static void main(String args[])
	{
		int n=4;
		int count=11;
		
	
		for(int i=n;i>=0;i--)
		{     int c=count;
			
			int c2=2;
			for(int j=i;j<=n;j++)
			{	
				System.out.print(c+"\t");
				c+=i+c2;
				c2++;
				

			}
		System.out.println();
			count-=i;
			
                      
		}
		
		
	}

}