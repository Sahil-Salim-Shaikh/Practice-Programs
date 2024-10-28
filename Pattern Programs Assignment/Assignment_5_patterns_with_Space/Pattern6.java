/*
    1
   12
  123
 1234
12345
*/

class Pattern6
{
	public static void main(String args[])
	{
		int n=5;
		
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}

			
				for(int k=i;k<=n;k++)
				{
					System.out.print(k);
		 		}
			System.out.println();
			}

		
	}
}