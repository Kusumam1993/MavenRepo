package SuperKeyword;

import java.util.Scanner;

public class AdditionNumber 
{
	public int addNum()
	{
	int num1,num2,sum;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first number");	
	num1=sc.nextInt();
	System.out.println("Enter the second number");
	num2=sc.nextInt();
	sum=num1+num2;
	System.out.println("The result is="+sum);
	return sum;
	
	}

}
