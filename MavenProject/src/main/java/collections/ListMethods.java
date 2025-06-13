package collections;

import java.util.ArrayList;

public class ListMethods
{

	public static void main(String[] args)
	{
		ArrayList <String> s= new ArrayList<String>();
		//Method1-add
		s.add("Car");
		s.add("Bike");
		s.add("Bus");
		System.out.println(s);
		//Method2-get
		System.out.println(s.get(1));
		//Method3-set
		s.set(2, "Lory");
		System.out.println(s);
		//Method4-indexOf
		s.add("Bike");
		System.out.println(s);
		System.out.println(s.indexOf("Bike"));
		//Method5-lastIndex
		System.out.println(s.lastIndexOf("Bike"));
		//Method6-Remove
		s.remove(3);
		System.out.println(s);
		//Method7-contains
		System.out.println(s.contains("Bus"));
		//Method8-isEmpty
		System.out.println(s.isEmpty());

		//Method9-size
		System.out.println(s.size());

		
		
		
	}

}
