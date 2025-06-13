package interfaceM;

public class MultipleChild implements MultipleParentA,MulipleParentB
{

	public static void main(String[] args) 
	{
		MultipleChild obj=new MultipleChild();
		obj.sum();
		obj.method();
		
	}
	public void sum()
	{
		int a=2;int b=3;
		int c=a+b;
		System.out.println("Sum="+c);
	}
	public void method()
	{
		System.out.println("Method");
	}

}
