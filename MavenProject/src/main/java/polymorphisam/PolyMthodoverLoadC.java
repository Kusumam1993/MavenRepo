package polymorphisam;

public class PolyMthodoverLoadC extends PolyMthodoverLoadP{

	public static void main(String[] args)
	{
		PolyMthodoverLoadC obj =new PolyMthodoverLoadC();
		obj.sum();

	}
	public void sum()
	{
		super.sum(2);
		int a=4;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}

}
