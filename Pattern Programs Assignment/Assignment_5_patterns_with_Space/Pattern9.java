/*
    A
   AB
  ABC
 ABCD
ABCDE
*/

class Pattern9
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>i;j--)
				{
					System.out.print(" ");
				}

			
				for(int k=1;k<=i;k++)
				{
					System.out.print((char)(k+64));
		 		}
			System.out.println();
			}

		
	}
}