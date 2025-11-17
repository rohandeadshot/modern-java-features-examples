package com.examples.java8.lambdas;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		
		/**
		 * prior java 8
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable Interface");
			}
		};
		
		new Thread(runnable).start();
		
		/**
		 * Lambda syntax
		 */
		
		Runnable runnableLambda = ()->{
			System.out.println("Inside Runnable Lambda example");
		};
		
		new Thread(runnableLambda).start();
		
	}
}
