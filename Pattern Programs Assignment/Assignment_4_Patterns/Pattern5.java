/*
5
54
543
5432
54321
*/
class Pattern5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);				
			}
		System.out.println();
		}
	}
}