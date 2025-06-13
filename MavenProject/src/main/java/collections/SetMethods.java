package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		s.add("Red");
		s.add("Blue");
		s.add("Black");
		System.out.println(s);
		Set<String >s1=new HashSet<String>();
		s1.add("Car");
		s1.add("Bike");
		s1.add("Bus");
		System.out.println(s1);
		//Method2-addAll
		s.addAll(s1);
		System.out.println(s);
		//Method3-contains
		System.out.println(s.contains("Red"));
		//Method4-containsAll
		System.out.println(s.containsAll(s1));
		//Method5-isEmpty
		System.out.println(s.isEmpty());
		//Method6-size
		System.out.println(s.size());
		//Method7-remove
		s.remove("Car");
		System.out.println(s);
		//Method8-removeAll
		s.removeAll(s1);
		System.out.println(s);
	}

}

