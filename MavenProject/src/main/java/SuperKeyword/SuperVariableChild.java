package SuperKeyword;

public class SuperVariableChild extends SuperVariable
{
	String name="Hazel";
	public static void main(String[] args) 
	{
		SuperVariableChild obj=new SuperVariableChild();
		obj.Print();
	}
	public void Print()
	{
		System.out.println(name);
		System.out.println(super.sum());//bcz sum is a variable in parent class 
	}

}
