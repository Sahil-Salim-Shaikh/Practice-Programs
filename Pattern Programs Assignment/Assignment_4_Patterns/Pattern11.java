/*
E
ED
EDC
EDCB
EDCBA

*/
class Pattern11
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(64+j));				
			}
		System.out.println();
		}
	}
}