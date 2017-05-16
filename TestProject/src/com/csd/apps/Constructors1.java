package com.csd.apps;

public class Constructors1 {
	int id;
	char abc;
	String name;
// we can not use any return type for constructors
	Constructors1(int id){
		this.id=id;
	
		System.out.println("this is constructors");
	
	}
	public static void main(String[] args) {

		
		Constructors1 c2=new Constructors1(12);
		System.out.println(c2.abc);
		c2.id=1444;
		//System.out.println(c2.id);
		
	}

}
