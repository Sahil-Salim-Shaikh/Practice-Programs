/*
54321
 4321
  321
   21
    1
*/

class Pattern18
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
					System.out.print(k);
		 		}
			System.out.println();
			}

		
	}
}