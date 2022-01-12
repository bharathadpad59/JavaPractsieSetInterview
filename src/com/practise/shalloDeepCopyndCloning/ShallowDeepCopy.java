package com.practise.shalloDeepCopyndCloning;

public class ShallowDeepCopy {

	public static void main(String[] args) {
		//SHALOW COPY
		
//1. In this we have passes the existing reference to other object ie copy of 1st
// But ay changes to 1st reference will affect other so its called shallow copy.
		
		
		Pojo p1= new Pojo();
		p1.id=1;
		p1.name="POJO-1";
		
		Pojo p2=p1;
		
		System.out.println(p1+"  "+p2);
		
		
		//DEEP COPY
		
//2. In this we have passes the existing reference data to other object ie copy of 1st
// But we are manually copy every variable one by one if its  50 variable it will be waste of time
// so its called deepy copy.
						
		
		Pojo p3= new Pojo();
		p3.id=p1.id;
		p3.name=p1.name;
		
		System.out.println(p1+"  "+p3);
		
		
		//CLONING (its deep Cloning)
//3.we are using Object classmethod which cretaes 2 separeate objects in easy way
		Pojo p5=null;
		try {
			p5=(Pojo) p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(p1==p5);
	}
}
