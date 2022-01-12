package com.practise.thread;

public class ThreadCheck extends Thread {

	public static void main(String[] args) {
		
		ThreadCheck t1= new ThreadCheck();
		t1.start();
	}
	
	//below method will run when u create start method in class because priority will be given to this
	//as because we are calling start method which is not thread instance its just class instance
	
//	public void start() {
//		System.out.println("this is local start");
//	}
	@Override
	public void run() {
		System.out.println("hiii");
	}
}
