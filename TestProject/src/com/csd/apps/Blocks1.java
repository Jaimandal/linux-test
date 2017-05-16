package com.csd.apps;

public class Blocks1 {
	static int age;
	String name;
	public Blocks1() {
		System.out.println("this is constructor");
	}

	//there is two type of blocks static and non-static
	//static blocks are mainly use to change default value of static variables.
	static{
		// this block is called as static block
		// this static block will be called during class loading time.
		age=20;
		System.out.println("this is static block");
	}
	
	//non static block can be use to initialize the non static variable
	{
		//non-static block will be called before constructor when an object will created .
		//here we can access both static and non static variable.
		this.name="jai";
		System.out.println("this is non- static block");
		age=23;
	}
	
	public static void main(String[] args) {

		
		Blocks1 b1=new Blocks1();
		b1.name="gita";
	}

}
