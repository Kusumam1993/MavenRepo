package interfaceM;
public class HDFC implements  RBI
{

	public static void main(String[] args)
	{
		HDFC obj=new HDFC();
		obj.recurringDeposit(30000,10);
		

	}
public void recurringDeposit(double amount,double duration)
{
	 System.out.println("Maturity Amount");
	 System.out.println( "====================" );
	 double maturityAmount;
	 //A = P * (1 + r/n)^(n*t)
	 maturityAmount=(amount*duration)+(amount*duration*(duration+1)/2.0)*(interestRate/12);
	 System.out.println(maturityAmount);
	 
	 
	 
}
}
