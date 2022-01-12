package com.practise.thread;

public class RunnableThraed implements Runnable {

	@Override
	public void run() {
		
		System.out.println("hello this is run method");
	}
	
	public static void main(String[] args) {
		Thread t1= new Thread(new RunnableThraed());
		t1.start();
		
	}
	
	public void start() {
		System.out.println("this is startmethiod of local");
	}

}
