/*
    1
   22
  333
 4444
55555
*/

class Pattern1
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int k=1;k<=n;k++)
			{
				for(int i=n;i>k;i--)
				{
					System.out.print(" ");
				}

			
				for(int j=1;j<=k;j++)
				{
					System.out.print(k);
		 		}
			System.out.println();
			}

		
	}
}