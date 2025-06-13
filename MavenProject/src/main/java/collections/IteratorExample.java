package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {

	public static void main(String[] args) 
	{
		Set<String>s=new TreeSet<String>();
		s.add("Red");
		s.add("Blue");
		s.add("Black");
		s.add("Green");
		System.out.println(s);
		
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();//Remove last element
		System.out.println(s);

	}

}
