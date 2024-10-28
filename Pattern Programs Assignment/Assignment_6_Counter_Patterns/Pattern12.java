/*
15	
10	14
6	9	13
3	5	8	12
1	2	4	7	11
*/

class Pattern12
{
	public static void main(String args[])
	{
		int n=5;
		int count=15;
		
	
		for(int i=n;i>=1;i--)
		{     int c=count;
			
			int c2=0;
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