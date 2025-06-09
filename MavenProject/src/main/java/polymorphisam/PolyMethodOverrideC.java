package polymorphisam;

public class PolyMethodOverrideC extends PolymorphisamMthodOverrideP {

	public static void main(String[] args)
	{
		PolyMethodOverrideC obj=new PolyMethodOverrideC();
		obj.sum();
		
	}
	public void sum()
	{
		super.sum();
		
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println("Diffrence of two integers"+" "+c);
	}

}
