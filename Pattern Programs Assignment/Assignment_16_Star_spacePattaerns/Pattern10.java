/*
*********
*	*
*	*
*	*
*	*
*	*
*	*
*	*
*********
*/
class PatternStar10
{

	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{ 
              
			for(int j=1;j<=n*2-1;j++)
			
				if(i==1 || j==1 || i==n*2-1 || j==n*2-1 || i==j ||i==n*2-i )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
		System.out.println();
		}


	}


}