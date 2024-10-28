/*
oA	mF	jJ	fM	aO
 	nB	kG	gK	bN
  		lC	hH	cL
   			iD	dI
    				eE
*/

class Pattern25
{
	public static void main(String args[])
	{
		int n=5;
		int count=15;
		int count2=1;
	
		for(int i=1;i<=n;i++)
		{     
			for(int k=1;k<i;k++)
			{
				System.out.print("\t");
			}
			 
			int c=count;
			int c2=count2;
			for(int j=i,j1=n;j<=n || j1>=i;j++,j1--)
			{	
				System.out.print((char)(96+c));
				
				System.out.print((char)(64+c2));
				System.out.print("\t");
				c-=j+1;
				c2+=j1;

			}
		System.out.println();
      			count-=i;
			count2++;
		    
			
                      
		}
		
		
	}

}