package com.csd.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization1 implements Serializable{

	public static void main(String[] args) throws Exception {
		String s1="Hello world";
		FileOutputStream fout=new FileOutputStream("test.txt");
		ObjectOutputStream ob=new ObjectOutputStream(fout);
		ob.writeObject(obj);
		
		
	}

}
