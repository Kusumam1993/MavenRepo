package aggregation;

public class Employee 
{
String empName;
int salary;
Company cmpnyName;

Employee(String name,int slry,Company cmpnyName)
{
	this.empName=name;
	this.salary=slry;
	this.cmpnyName=cmpnyName;
	
}
public void print()
{
	System.out.println("Employee Name" +" = "+empName);
	System.out.println("Salary"+" = "+salary);
	System.out.println("Company Name"+" = "+cmpnyName.cmpyName+" "+cmpnyName.location);
	
}

	public static void main(String[] args)
	{
		Company obj1=new Company("TCS","Kochi");
		Employee obj=new Employee("Hazel",40000,obj1);
		obj.print();
		
	}
	

}
