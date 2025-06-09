package encapsulation;

public class EncapsulationParent
{
	private String name;//Private is used as a key part of encapsulation for security increasing
	private int rollNo;
	
	public void set(String n,int no)
	{
		this.name=n;
		this.rollNo=no;
		
	}
	public void get()
	{
		System.out.println("Name :"+name);
		System.out.println("RollNumber:"+rollNo);
	}

}
