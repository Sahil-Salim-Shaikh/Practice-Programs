/*
    5
   44
  333
 2222
11111
*/

class Pattern2
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int k=n;k>=1;k--)
			{
				for(int i=1;i<k;i++)
				{
					System.out.print(" ");
				}

			
				for(int j=n;j>=k;j--)
				{
					System.out.print(k);
		 		}
			System.out.println();
			}

		
	}
}