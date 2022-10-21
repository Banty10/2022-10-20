package com.java.excrcise2;

import java.util.Scanner;

public class divide {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter numerator : ");
		int x=input.nextInt();
		System.out.println("Enter denominator");
		int y=input.nextInt();

		System.out.println("Division : "+divide(x,y));

		input.close();
	}

	public static int divide(int a, int b) {
		int d=0;
		try {
			d = a/b;

		}catch(ArithmeticException e) {
			System.out.println("Can not divide by zero");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
		

	}

}
