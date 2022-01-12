package com.practise.thread;

public class LambaThread {

	public static void main(String[] args) {
		Runnable r1=()->{
			System.out.println("thread 1 strted");
		};
		
		Thread t1= new Thread(r1);
		t1.start();
	}
}
