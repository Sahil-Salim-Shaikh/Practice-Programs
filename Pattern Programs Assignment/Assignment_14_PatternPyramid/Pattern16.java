/* 
543212345
 5432345
  54345
   545
    5  
*/

class  Pattern16
{
	public static void main (String args [])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			
			for(int j=n;j>=i;j--)
				System.out.print(j);
			for(int j=i+1;j<=n;j++)
				System.out.print(j);
			

		System.out.println();

		}

	}



}