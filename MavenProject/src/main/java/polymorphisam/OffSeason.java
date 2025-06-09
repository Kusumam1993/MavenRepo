package polymorphisam;

public class OffSeason extends OnSeason
{

	public static void main(String[] args)
	{
		OffSeason obj=new OffSeason();
		obj.discount(3000);
		

	}
	public void discount(int a)
	{
		
		super.discount(3000);
		System.out.println("------------");
		System.out.println("OffSeason");
		System.out.println("------------");
		System.out.println("Discounted 15%");
		int dicnt=(a*15)/100;
		System.out.println("Discounted Amount is="+dicnt);
		
	}

}
