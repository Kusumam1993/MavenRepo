package exceptionHandling;

public class ExampleThrow
{

	public static void main(String[] args)
	{
		//ExampleThrow obj=new ExampleThrow();
		//obj.print();
		try
		{
			print(30);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occures");
		}
		
		
	}
	public static void print(int age) throws ArithmeticException
	{
		
		if (age>18)
		{
			throw new ArithmeticException ("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}

}
