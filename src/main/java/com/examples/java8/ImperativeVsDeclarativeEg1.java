package com.examples.java8;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEg1 {
	public static void main(String[] args) {
		
		/**
		 * Imperative - style programming.
		 */
		
		int sumI =0;
		long t1 = System.currentTimeMillis();
		for (int i = 0; i <= 1000; i++) {
			sumI+=i;	
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Sum using Imperative Approach : " + sumI);
		System.out.println("time difference : "+(t2-t1));
		
		/**
		 * Declarative - style programming. 
		 * the variable is immutable.
		 * easy to run in multi thread environment.
		 * parallel() will split the values to run in multi thread.
		 */
		
		t1=System.currentTimeMillis();
		int sumD = IntStream.rangeClosed(0, 1000).parallel().sum();
		t2 = System.currentTimeMillis();
		System.out.println("Sum using Declarative Approach : " +sumD);
		System.out.println("time difference : "+(t2-t1));
		
	}
}
