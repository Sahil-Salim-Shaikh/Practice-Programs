/*
54321
 5432
  543
   54
    5
*/

class Pattern17
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<i;j++ )
				{
					System.out.print(" ");
				}

			
				for(int k=n;k>=i;k--)
				{
					System.out.print(k);
		 		}
			System.out.println();
			}

		
	}
}