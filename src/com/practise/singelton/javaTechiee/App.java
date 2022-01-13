package com.practise.singelton.javaTechiee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */

// WE can break the singleton pattern in 3 ways
//1. By Serializationa and deseralization
//2. By cloning clone() method
//3. By Reflection Api by calling  LazySingleton.class.getDeclaredConstructors(.setAccessible(true))


//Avoid These breaks Solution
//1. By readResolve() method which will be called while desearlization, so here we can just return
// existing instance which already created.

//2. by overide clone() method in singleton class and throwing error in that.
//3. by checking in Private Constructor whether the object is  not null then throw exedcption.


public class App {
	public static void main(String[] args)
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		PrintWriter pw = new PrintWriter("JSONExample.json");
		
		System.out.println("Hello World!");

		LazySingleton instance1 = LazySingleton.getInstance();
		//System.out.println(instance1.hashCode());

		// Serialize singleton object to a file.
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();

		// Deserialize singleton object from the file
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton instance2 = (LazySingleton) in.readObject();
		in.close();

		System.out.println("instance1 hashCode: " + instance1.hashCode());
		System.out.println("instance2 hashCode: " + instance2.hashCode());

		/*
		 * LazySingleton reflectionInstance=null;
		 * 
		 * 
		 * Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
		 * for (Constructor constructor : constructors) {
		 * constructor.setAccessible(true); reflectionInstance = (LazySingleton)
		 * constructor.newInstance(); }
		 * 
		 * System.out.println(reflectionInstance.hashCode());
		 */

		/*
		 * LazySingleton instance2 = (LazySingleton) instance1.clone();
		 * 
		 * System.out.println(instance2.hashCode());
		 */
	}
}