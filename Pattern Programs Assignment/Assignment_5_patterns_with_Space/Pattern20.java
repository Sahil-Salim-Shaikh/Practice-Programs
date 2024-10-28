/*
eeeee
 dddd
  ccc
   bb
    a
*/

class Pattern20
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
					System.out.print((char)(96+i));
		 		}
			System.out.println();
			}

		
	}
}