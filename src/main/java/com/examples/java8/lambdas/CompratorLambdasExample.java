package com.examples.java8.lambdas;

import java.util.Comparator;

public class CompratorLambdasExample {
	public static void main(String[] args) {
		/**
		 * prior java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("result of comprator is : "+comparator.compare(3, 2));
		
		/**
		 * Lambda
		 */
		
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};
		Comparator<Integer> comparatorLambda1 = (a,b)->a.compareTo(b);
		System.out.println("result of comprator using lambda : "+comparatorLambda.compare(3, 4));
		System.out.println("result of comprator using lambda not mentioning type : "+comparatorLambda1.compare(4, 4));
	
	}

}
