/* 
11111
00000
11111
00000
11111
*/
class  Pattern1
{
	public static void main (String args [])
	{
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}



	}



}