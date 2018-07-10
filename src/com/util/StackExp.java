package com.util;

import java.util.Stack;

public class StackExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack sta = new Stack();
		
		for (int i=0;i<5;i++)
			sta.push(i);
	//	System.out.println(sta);
		sta.forEach(System.out::println);
		 System.out.print ( sta.pop() );
		 
		/*while (!sta.empty())
		{
			
			 System.out.print ( sta.pop() );
             System.out.print ( ',' );
		}*/
		
		System.out.println("lift off");
				
	}

}
