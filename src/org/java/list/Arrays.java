package org.java.list;

public class Arrays {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println("normal loop");
		System.out.println("Lenght:"+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("enhanced loop");
		for(int x : a) {
			System.out.println(x);
		}
		
	}

}
