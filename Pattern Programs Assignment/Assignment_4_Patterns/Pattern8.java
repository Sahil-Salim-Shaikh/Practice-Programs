/*
e
dd
ccc
bbbb
aaaaa

*/
class Pattern8
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(96+i));				
			}
		System.out.println();
		}
	}
}