package abstraction;

import java.util.Scanner;

public class Contractor extends Employee
{

	public static void main(String[] args) 
	{
		
		Employee obj=new Contractor();
		obj.calculateSalary();
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj1.FullTimeEmpSalary(3000);
		
	}
	public void calculateSalary()
	{
		
		Scanner sc =new Scanner(System.in);		
		System.out.println("Enter Working hours");
		double totalWorkingHour=sc.nextDouble();
		System.out.println("Payment per Hour");
		double paymentPerHour=sc.nextDouble();		
		double totalPayment=paymentPerHour*totalWorkingHour;
		System.out.println("Total Payment per day="+totalPayment);
		
		
		
	}
	
}
