package com.practise.Lambda;

public class LambdaPractise {

	public static void main(String[] args) {
		
		firstInterface result=stringValue->System.out.println("printing result==="+stringValue);
		result.firstInterfaceImpl("bharat here");
		
		SecondInterface result2=(a,b)->{
			return a+b;
		};
		
		System.out.println("addition result==="+result2.add(1, 4));
	}
	
	interface firstInterface{
		void firstInterfaceImpl(String first);
	}
}
