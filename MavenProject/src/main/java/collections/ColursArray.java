package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ColursArray {

	public static void main(String[] args)
	{
		List<String> s=new ArrayList<String>();
		s.add("Red");
		s.add("Blue");
		s.add("Black");
		s.add("Pink");
		s.add("Violet");
		s.add("White");
		System.out.println(s);
		
		System.out.println(s.get(1));
		Iterator <String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(s.remove(2));
		System.out.println(s);
		System.out.println(s.contains("Black"));
		
	}

}
