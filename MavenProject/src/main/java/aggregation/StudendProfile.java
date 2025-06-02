package aggregation;

public class StudendProfile //class A
{
	String name;
	int id;
	Address address;//object class B//has a relationship
	StudendProfile(String name,int id,Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		
	}
	public void display()
	{
		System.out.println("Name:="+name);
		System.out.println("Id:="+id);
		System.out.println("Address:="+address.city+", "+address.state);
		
	}
	public static void main(String[] args)
	{
		Address obj1=new Address("Idukki","Kerala");
		StudendProfile obj=new StudendProfile("HAzel",32,obj1);
		obj.display();
		
	}

}
