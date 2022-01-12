package com.practise.finalStaticVariable;

public class FinalStaticClass {

	static  Integer i;
	final Integer j;
	final static Integer k;
	// we can declare final static variable directly or through static block only
	 static
	    {
	        k = 10;
	    }
	public FinalStaticClass() {
		//we can declare static variable from constructor as well as from method
		
		// we can declare final variables directly or from CONSTRUTOR
		this.i=2;
		this.j=2;
//		this.k=4; not possible because this will reinitialize every time the object is created
		// wich is not possible in final case
	}
	
	public static void main(String[] args) {
		FinalStaticClass.i=0;
//		FinalStaticClass.k=4;
	}

}
