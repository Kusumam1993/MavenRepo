package SuperKeyword;

public class AdditionDivisible extends AdditionNumber
{
	int s=super.addNum();
	public static void main(String[] args) 
	{
		
		AdditionDivisible obj =new AdditionDivisible();
		obj.addDivisible();
		//obj.addNum();
		
	}
	public void addDivisible() 
	{
		
		if(s%10==0)
		{
			System.out.println(s +" "+ "is divisible by 10");
		}
		else
		{
			System.out.println(s +" "+"is not divisible by 10");
		}
		
	}

}
