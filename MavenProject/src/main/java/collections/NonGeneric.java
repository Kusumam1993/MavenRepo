package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class NonGeneric 
{

	public static void main(String[] args)
	{
		HashSet s1=new HashSet();
		s1.add(2);
		s1.add("Car");
		s1.add('A');
		System.out.println(s1);
		List s2=new ArrayList();
		s2.add(34);
		s2.add("car");
		s2.add('d');
		System.out.println(s2);
	    Set s=new TreeSet();
		s.add("a");
		s.add("Car");
		s.add("A");
		System.out.println(s);
		
	}

}
