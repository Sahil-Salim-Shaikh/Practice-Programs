/*
AK	CG	FD	JB	OA
BL	EH	IE	NC
DM	HI	MF
GN	LJ
KO
	*/

class Pattern3
{
	public static void main(String args[])
	{	int n=5;
		int count=1;
		int count2=11;
		for(int i=1;i<=n;i++)
		{
			
			
				int c=count;
				int c2=count2;
			for(int j=i,j1=n;j<=n ;j++,j1--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c2+64));
				System.out.print("\t ");

				c+=j+1;
				c2-=j1-1;
			}
                        System.out.println();
                       count+=i;
			count2++;
			
		}		
	}

}