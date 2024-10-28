/*
					AO
				BJ	FN
			CF	GI	JM
		DC	HE	KH	ML
	EA	IB	LD	NG	OK
*/

class Pattern1
{
	public static void main(String args[])
	{	int n=5;
		int count=1;
		int count2=15;
		for(int i=n;i>=1;i--)
		{
			
			for(int k=1;k<i;k++)
			{
				System.out.print("\t ");
			}

				int c=count;
				int c2=count2;
			for(int j=n,j1=i;j>=i || j1<=n;j--,j1++)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c2+64));
				System.out.print("\t ");

				c+=j-1;
				c2+=j1;
			}
                        System.out.println();
                       count++;
			count2-=i;
			
		}		
	}

}