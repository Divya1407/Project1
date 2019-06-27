package org.java.list;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList li= new ArrayList();
		li.add("hi");
		li.add(10);
		li.add("hello");
		li.add("bye");
		li.add(true);
		li.add(10);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(3));
		li.add(50);
		
		
		
	}

}
