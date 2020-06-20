package com.multithreading;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Deque<E> extends Queue<E>
//LinkedList<E> implements Deque
public class DQueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque dq = new LinkedList<>();
		dq.push("Test");
		dq.add("tests");
		dq.add("tests");
		dq.add("tests");
		dq.add("tests");
		
		System.out.println(dq.size());
		Object firstElement = dq.peek(); //retrieve head but not remove.
		
		Object firstElemen1t = dq.remove(); //retrieve head but not remove.
		
		System.out.println(firstElement);
		
		System.out.println(firstElemen1t);
		
		
	}

}
