/* 
1
22
333
4444
55555
4444
333
22
1
*/
class  Pattern1
{
	public static void main (String args [])
	{
		int n=15;
		for(int i=1;i<=(n*2-1);i++)
		{  
				if(i<=n)
				{
					for(int j=1;j<=i;j++)	
					{
						System.out.print(i);
					}
				}			
				else{
												
					for(int j=1;j<=n*2-i;j++)	
					{
						System.out.print(n*2-i);
					}	


				   }
		System.out.println();
		}   



	}



}