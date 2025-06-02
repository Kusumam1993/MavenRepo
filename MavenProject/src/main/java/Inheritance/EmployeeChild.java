package Inheritance;

public class EmployeeChild extends EmployeeParentB
{
	int basicamount=super.basicPay();
	float hra=super.hra();
	float pf=super.pf();
	float deduction=super.deductionAmount();
	float bonus=super.bonusAmount();

	public static void main(String[] args)
	{
		EmployeeChild obj=new EmployeeChild();	
		obj.salarySlip();
		//obj.totalSalary();		
	}
	public float totalSalary()
	{
		
		float totalSalary=basicamount+hra-pf-deduction+bonus;
		//System.out.println("Total Salary::="+totalSalary);
		return totalSalary;
		
	}
	public void salarySlip()
	{
        System.out.println("-------Salary Slip-------");
		System.out.println("Basic Pay   ="+basicamount);
		System.out.println("Deduction   ="+deduction);
		System.out.println("hra         ="+hra);
		System.out.println("pf          ="+pf);
		System.out.println("Bonus       ="+bonus);
	    System.out.println("========================");
		System.out.println("Total Salary="+totalSalary());
		System.out.println("========================");
		
		
				
	}

}
