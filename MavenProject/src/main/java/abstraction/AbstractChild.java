package abstraction;

public class AbstractChild extends AbstractParent
{

	public static void main(String[] args) 
	{
		AbstractParent obj=new AbstractChild();//upcasting
		obj.print();
		obj.display();

	}
	public void print()
	{
		System.out.println("Print");
	}

}
