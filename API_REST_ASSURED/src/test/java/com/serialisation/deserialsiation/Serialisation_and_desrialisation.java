package com.serialisation.deserialsiation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	
	int i=10; int j=20;
}

public class Serialisation_and_desrialisation {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t= new Test();
		
		//Serialisation
		FileOutputStream fos= new FileOutputStream("Test.txt"); //path of the file in which we are going to put data
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		
		//desreialsation
		FileInputStream fis= new FileInputStream("Test.txt"); //path of the file in which we are going to put data
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test t2=(Test)ois.readObject();
		
		System.out.println(t.i+"   "+t.j);
		
		
		
		
	}

}
