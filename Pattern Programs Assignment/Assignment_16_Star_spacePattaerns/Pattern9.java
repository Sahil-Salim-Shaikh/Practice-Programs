/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
class PatternStar9
{

	public static void main(String args[])
	{
		
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{ 
              
                     if(i<=n)
		     {
			for(int j=i;j<=n;j++)
			{
				if(j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for(int j=1;j<=i*2-2;j++)
			{
				if(j==i*2-2)
				
					System.out.print("*");
				
				else
				
					System.out.print(" ");
				
			}
		     }
		     else
		     {
				for(int j=1;j<=i-n+1;j++)
				{
					if(j==i-n+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}

				for(int j=1;j<=(n * 2 - i - 1) * 2;j++)
				{
					if(j==((n * 2 - i - 1) * 2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
						

		System.out.println();
		}

	}


}