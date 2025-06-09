package abstraction;

public class Child extends Parent
{

	public static void main(String[] args)
	{
		Parent obj=new Child();
		obj.diifrence();
		obj.sum();
		
	}
public void sum()
{
	int a=2;
	int b=3;
	int sum=a+b;
	System.out.println("Add="+sum);
	
}
}
