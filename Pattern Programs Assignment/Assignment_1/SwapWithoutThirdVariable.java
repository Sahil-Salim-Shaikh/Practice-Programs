public class SwapWithoutThirdVariable
{
	public static void main(String args[])
	{
		int a=5;
		int b=10;
		System.out.println("Before swaping value of a: "+a+" and b: "+b);



		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping value of a: "+a+" and b: "+b);


	}




}