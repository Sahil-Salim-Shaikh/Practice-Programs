/*
EDCBA
 DCBA
  CBA
   BA
    A
*/

class Pattern25
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int i=n;i>=1;i--)
			{
				for(int j=n;j>i;j-- )
				{
					System.out.print(" ");
				}

			
				for(int k=i;k>=1;k--)
				{
					System.out.print((char)(64+k));
		 		}
			System.out.println();
			}

		
	}
}