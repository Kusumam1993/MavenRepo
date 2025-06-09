package finalKeyword;

public class FinalVariable
{
	final int speed=80;
	
	public void drive()
	{
		//speed=60;//the variable speed final already assigned in class.s
		System.out.println(speed);
		 
	}

	public static void main(String[] args)
	{
		FinalVariable obj=new FinalVariable();
		obj.drive();
		
	}

}
