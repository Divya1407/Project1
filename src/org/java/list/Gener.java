package org.java.list;

import java.util.ArrayList;

public class Gener {

	public static void main(String[] args) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			System.out.println(a);
		    boolean c = a.contains(10);
			System.out.println(c);
			System.out.println(a.size());
			for(int i = 0;i<a.size();i++) {
				System.out.println(a.get(i));
			}
			System.out.println("enhanced loop");
			for(Integer x : a) {
				System.out.println(x);
			}
		
		}

	}



