package SuperKeyword;
//super method invoke

public class SuperMethodChild  extends SuperMethodParent
{

	public static void main(String[] args)
	{
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.name();
	}
	public void name()
	{
		super.print();
		System.out.println("Hazel Anna Arun");
	}

}
