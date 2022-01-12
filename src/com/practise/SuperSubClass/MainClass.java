package com.practise.SuperSubClass;


class MainClass {
	String className="MainClass";
	
public static void main(String[] args) {
		
	Subclass s1= new Subclass();
	System.out.println("***********");
	SupSubClass s2= new SupSubClass();
	System.out.println("***********");
	SupSubClass s3= new Subclass();
//	s1.display();
	System.out.println("*******************************");
	AbstractImpl ab= new AbstractImpl();
	System.out.println("*******************************");
	MainClass m= new MainClass();
	m.thisClass(5);
	}

	public  void thisClass(int mainClass) {
		this.thisClassInstance(this);
	}
	
	public  void thisClassInstance(MainClass mainClass) {
		System.out.println(mainClass.className);
	}
}
