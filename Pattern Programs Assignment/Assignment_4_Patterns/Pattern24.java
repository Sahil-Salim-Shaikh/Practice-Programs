/*
edcba
dcba
cba
ba
a

*/
class Pattern24
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(96+j));				
			}
		System.out.println();
		}
	}
}