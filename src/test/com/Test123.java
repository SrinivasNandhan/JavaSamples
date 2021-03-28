package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Credentials> stud = new ArrayList<>();

		Credentials c1 = new Credentials("Aditya", 1, 15);
		Credentials c2 = new Credentials("Ramesh", 2, 15);
		Credentials c3 = new Credentials("Suresh", 3, 15);
		Credentials c4 = new Credentials("Mahesh", 4, 15);
		Credentials c5 = new Credentials("Naresh", 5, 15);
		Credentials c6 = new Credentials("Sarvesh", 6, 15);

		stud.add(c1);
		stud.add(c2);
		stud.add(c3);
		stud.add(c4);
		stud.add(c5);
		stud.add(c6);

		stud.remove(1);

		/*
		 * for (Credentials c :stud) { // System.out.println("After removing size is " +
		 * stud.size() + " And Element are :" + stud); System.out.println(c.getId() +
		 * " Name::" + c.getName()); }
		 * 
		 * Iterator<Credentials> itr = stud.iterator(); while (itr.hasNext()) {
		 * Credentials number = itr.next(); // System.out.println(number.getId() +
		 * "Name::" + number.getName()); if (number.getId() == 2) { itr.remove(); } }
		 * 
		 * for (Credentials c :stud) { // System.out.println("After removing size is " +
		 * stud.size() + " And Element are :" + stud); System.out.println(c.getId() +
		 * " Name::" + c.getName()); }
		 * 
		 * 
		 * Iterator<Credentials> iterator = stud.iterator(); while (iterator.hasNext())
		 * { Credentials cs = iterator.next(); stud.remove(2); }
		 * 
		 * 
		 * // stud.remove(3); // System.out.println(stud.toString());
		 */
	}

}
