package polymorphisam;

public class PolyMthodoverLoadP 
{
	public void sum(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	public void sum(int a)
	{
		this.sum(3,2);
		System.out.println(a);
	}

}
