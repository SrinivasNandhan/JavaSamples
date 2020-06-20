package com.multithreading;

import java.util.PriorityQueue;

//complexity  O(n log(k)) 

/*n Priority queue items are ordered by key value so that item with the lowest value of key
is at front and item with the highest value of key is at rear or vice versa*/

// In a priority queue, an element with high priority is served before an element with low priority.
//priority queue is implemented using a max heap.
public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(7); //Initial capacity

		int[] ss = { 3000, 5,1333, 10, 1,3000, 23, 42, 66, 3212, 545, 110 };

		for (int i : ss) {
			pq.add(i);
			
		//	System.out.println("pq initial vals :" +pq);
			
			if (pq.size() > 2) {
				pq.poll(); // retrive and remove head of queue
		//		System.out.println("pq val :" +pq);	
			}
		}
		
		System.out.println(pq);
		
	 //=====based on string length 
				
		PriorityQueue<String> pqq = new PriorityQueue<String>(5,new myComparator());	
				
		pqq.add("Tion");
		pqq.add("Der");
		pqq.add("Ar");
		pqq.add("Pewtr");
		pqq.add("Daenrqweys");
		pqq.add("Aryqwe");
		pqq.add("Petyqewr");
		pqq.add("Daeneqeqwerys");
		
		while (pqq.size() !=0)
		{
			 System.out.println(pqq.poll());
		}
				
	}

}
