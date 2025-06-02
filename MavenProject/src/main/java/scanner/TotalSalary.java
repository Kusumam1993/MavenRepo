package scanner;

public class TotalSalary extends SalaryCalculate
{

	double total;
	public void total()
	{
		//super.calculation();
		total=basicPay+hra-pf-deduction+bonus;
	}
	public void salarySlip()
	{
		System.out.println("-------Salary Slip-------");
		System.out.println("Basic Pay   ="+basicPay)  ;
		System.out.println("Deduction   ="+deduction);
		System.out.println("hra         ="+hra);
		System.out.println("pf          ="+pf);
		System.out.println("Bonus       ="+bonus);
		System.out.println("========================");
		total();
		System.out.println("Total Salary="+total);
		System.out.println("========================");

	}
	public static void main(String[] args)
	
	{
		TotalSalary obj=new TotalSalary ();
		obj.getDetails();
		obj.calculation();
		obj.salarySlip();

	}

}
