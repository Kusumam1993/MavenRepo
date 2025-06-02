package scanner;
import java.util.Scanner;
public class EmployeeDetails
{
double basicPay,deduction,bonus;
public void getDetails()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the basicPay  :");
	basicPay =sc.nextDouble();
	System.out.println("Enter the Deduction :");
	deduction=sc.nextDouble();
	System.out.println("Enter the Bonus     :");
	bonus=sc.nextDouble();
}
}
