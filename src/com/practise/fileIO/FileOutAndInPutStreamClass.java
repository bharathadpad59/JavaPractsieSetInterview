package com.practise.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOutAndInPutStreamClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		POJO p1= new POJO();
		p1.id=1;
		p1.name="First Pojo";
		p1.exclude="Excluding Part";
		
		System.out.println(p1);
		File file= new File("D:/POJO.txt");
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(p1);
		
		
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		POJO result=(POJO)ois.readObject();
		
		System.out.println(result);
		
	}
}
