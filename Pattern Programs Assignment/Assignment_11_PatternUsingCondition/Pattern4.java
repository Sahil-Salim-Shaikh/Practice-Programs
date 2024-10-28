/* 
11111
22221
33321
44321
54321
*/
class  Pattern4
{
	public static void main (String args [])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{  
			
			for(int j=n;j>=1;j--)
			{
				if(j>=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(j);

				}			



			}
		System.out.println();
		}   



	}



}