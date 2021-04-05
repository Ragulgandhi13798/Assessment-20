package studentpac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	int id;
	int age;
	String name;
	
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
}

public class Comparatore {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee (11,45,"raja"));
		al.add(new Employee (18,23,"king"));
		al.add(new Employee (13,20,"som"));
		
		Comparator<Employee> C1 = (S1, S2) -> {
			
			return(S1.age==S2.age)? 0 :(S1.age>S2.age)? 1 : -1;
		};
		
		
		Collections.sort(al,C1);
		
		for(Employee s :al)
			
		{
			System.out.println(s.id+ " "+s.age+" "+s.name);
		}
		
	}

}
