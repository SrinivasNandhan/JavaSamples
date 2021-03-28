package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student =null;
		List<Student> list =new ArrayList<>();
		
		for (int i =1 ; i <10 ; i++)
		{
			
			student = new Student(i, "student" + i, "A");
			list.add(student);
			
		}
		
		System.out.println(list);
		
		
		Iterator<Student> si= list.iterator();
		
		while (si.hasNext())
		{
			Student ss = si.next();
			if (ss.getId() % 2 == 0)
			{
				System.out.println("EVEN");
				si.remove();
				
			}
			
		}
		
		System.out.println(si.toString());
		
		/*
		 * for (Student studen:list) {
		 * 
		 * if (studen.getId() % 2 == 0) { System.out.println("EVEN");
		 * list.remove(studen.getId());
		 * 
		 * }
		 * 
		 * }
		 */
		
	}

}

