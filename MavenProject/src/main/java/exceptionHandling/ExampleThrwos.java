package exceptionHandling;

public class ExampleThrwos 
{

	public static void main(String[] args)
	{
		print(30);
		
	}
	public static void print(int age) throws ArithmeticException
	{
		
		if (age>18)
		{
			throw new ArithmeticException  ("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}

}
