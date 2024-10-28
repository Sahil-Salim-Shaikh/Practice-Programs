/*
 *
  *
   *
    *
     *
    *
   *
  *
 * 

*/
class Pattern6
{

	public static void main(String args[])
	{
		int n=15;
		for(int i=1;i<=n*2-1;i++)
		{ 
              
                     if(i<=n)
			
			for(int j=1;j<=i;j++)
			{
				if(j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		    else
			for(int j=1;j<=n*2-i;j++)
			{
				if(j==n*2-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			

		System.out.println();
		}


	}


}