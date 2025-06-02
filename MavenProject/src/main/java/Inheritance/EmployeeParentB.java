
package Inheritance;

public class EmployeeParentB  extends EmployeeParentA
{
	public float hra()
	{
		int amt=super.basicPay();
		
		float hraAmount=5*(amt/100);
		return hraAmount;
		
	}
	public float pf()
	{
		int amt=super.basicPay();
		
		float hraAmot=20*(amt/100);
		return hraAmot;
		
	}
	

}
