/*
Ae
Cd       Bi
Fc       Eh      Dl
Jb       Ig      Hk      Gn
Oa       Nf      Mj      Lm      Ko

	*/

class Pattern2
{
	public static void main(String args[])
	{	int n=5;
		int count=1;
		int count2=5;
		for(int i=1;i<=n;i++)
		{
			
			
				int c=count;
				int c2=count2;
			for(int j=1,j1=n;j<=i ;j++,j1--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c2+96));
				System.out.print("\t ");

				c--;
				c2+=j1;
			}
                        System.out.println();
                       count+=i+1;
			count2--;
			
		}		
	}

}