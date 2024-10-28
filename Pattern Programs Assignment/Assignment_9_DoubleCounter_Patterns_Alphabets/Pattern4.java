/*
Oe      Mi      Jl      Fn      Ao
        Nd      Kh      Gk      Bm
                Lc      Hg      Cj
                        Ib      Df
                                Ea	*/

class Pattern4
{
	public static void main(String args[])
	{	int n=5;
		int count=15;
		int count2=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("\t");
			}
			
				int c=count;
				int c2=count2;
			for(int j=i,j1=n;j<=n ;j++,j1--)
			{
				System.out.print((char)(c+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");

				c-=j+1;
				c2+=j1-1;
			}
                        System.out.println();
                       count-=i;
			count2--;
			
		}		
	}

}