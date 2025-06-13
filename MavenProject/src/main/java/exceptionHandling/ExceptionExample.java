package exceptionHandling;

public class ExceptionExample
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Its not valid Operation");
		}
		finally
		{
			int a=10;
			int b=2;
			int c=a/b;
			System.out.println("Value="+c);
			System.out.println("Its valid");
		}
		
	}

}
