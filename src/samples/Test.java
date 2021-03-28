package samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		List<Student> stulist = new ArrayList<Student>();

		List<Student> lsit = getStudentList();
		
		Map<Integer ,String> maps = new HashMap<>();
		
		// remvove id 5
		
		
	  Iterator<Student>	stlist = lsit.iterator();
	  
	  while (stlist.hasNext())
	  {
		  Student s = stlist.next();
		  
		  maps.put(s.getId(), s.getName());
		  
		  if (s.getId() == 5)
		  {
			  stlist.remove();
		  }
		  
	  }
	  
		
		printStudent(lsit);
		

		for (Map.Entry<Integer, String> entry : maps.entrySet()) {
		    System.out.println("key:" + entry.getKey() + "| value:" + entry.getValue().toString());
		}
	}
	private static List<Student> getStudentList() {

		List<Student> stulist = new ArrayList();

		for (int i = 1; i < 11; i++) {
			stulist.add(new Student(i, "Student Name" + i));
			stulist.add(new Student(i, "Student duplicateName" + i));
		}
		return stulist;
	}
	
	
	private static void printStudent(List<Student> lsit) {
		
		
		for (Student s : lsit) {
			
			System.out.println("Student id::" + s.getId() + " name::" + s.getName());
		}

	}

}
