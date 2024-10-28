/**
 * Prime
 */
public class Prime {

	public static void main(String[] args) {
	  int n=5;
	  int count=0;

	  for (int i = 1; i <=n; i++) {
		 if (n%i==0) {

			count++;
			
		 }
	  }

	  if (count==2)//if count is 2 it is divisible by 1 and itself
	   {
		System.out.println("it is prime no" );
		
	  }
	  else {
		System.out.println("it is not a prime no");
	  }
	}
}