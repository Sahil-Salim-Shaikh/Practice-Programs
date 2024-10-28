/*
Ao 	Fn	 Jl	 M i	Oe
Bm 	Gk	 Kh	 Nd
Cj	Hg	 Lc
Df      Ib
Ea
*/

class Pattern26
{
	public static void main(String args[])
	{
		int n=5;
		
		int count=15;
		int count2=1;
		for(int i=1;i<=n;i++)
		{     
						 
			int c=count;
			int c2=count2;
			for(int j=i,j2=n;j<=n || j2>=i;j++,j2--)
			{	
				
				
				System.out.print((char)(64+c2));
				System.out.print((char)(96+c));
				System.out.print("\t");
				c-=j;
				c2+=j2;

			}
		System.out.println();
      			
		count-=i+1;
		count2++;
			
                      
		}
		
		
	}

}