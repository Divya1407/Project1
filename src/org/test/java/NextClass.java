package org.test.java;

import java.util.Scanner;

public class NextClass {
	public static void main(String[] args) {
		System.out.println("scanner");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value a:");
		byte a = s.nextByte();
		System.out.println("enter the value b:");
		int b = s.nextInt();
		System.out.println("enter the value c:");
		int c = s.nextInt();
		System.out.println("enter the value d:");
		int d = s.nextInt();
		if((a>b)&&(a>c)&&(a>d)){
			System.out.println("A is greater");
		}
		else if((b>c)||(d<b))
		{
			System.out.println("B is greater");
		}
		else if(c>d) {
			System.out.println("C is greater");
		}
		else {
			System.out.println("D is greater");
		}
		
		System.out.println("end");
	}

}
