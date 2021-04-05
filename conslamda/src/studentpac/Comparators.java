package studentpac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	
	int id;
	String name;
	
	
	public Student (int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class Comparators {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student (11,"raja"));
		al.add(new Student (18,"king"));
		al.add(new Student (13,"som"));
		
		Comparator<Student> C1 = (E1, E2) -> {
			
			return(E1.id==E2.id)? 0 :(E1.id>E2.id)? 1 : -1;
		};
		
		
		Collections.sort(al,C1);
		
		for(Student s :al)
			
		{
			System.out.println(s.id+ " "+s.name);
		}
		
	}
}