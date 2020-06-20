package com.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("RAO");
		list.add("LOL");
		list.add("POP");

		getStream(list);
	}

	private static void getStream(List<String> list) {
		Stream<String> streams = list.stream();
		Iterator<String> it = streams.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() + "-");
		}

	}

}
