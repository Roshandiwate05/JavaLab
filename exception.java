class exception
{
	public static void main(String args[])
	{
		int  a=10;
		int b=2;
		try
		{
			int x=a/b;
			System.out.println("Result="+x);
		}
	        catch(ArithmeticException e)
		{
			System.out.println("Caught an excptionn:"+e.getMessage());
		}
			System.out.println("End of the program:");
	}	
}

