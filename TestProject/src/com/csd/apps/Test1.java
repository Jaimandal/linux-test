package com.csd.apps;

import java.util.Scanner;

class Spclass{
	public int age=20;
	public void spMethod(){
		System.out.println("this is super method");
	}
}

public class Test1 extends Spclass {

	public String name;
	
	public void Method1(){
		System.out.println("this is non static method");
		this.name="method1 name";
		System.out.println(this.name);
		//super.age=44;
		System.out.println(super.age);
		super.spMethod();
	}
	
	public static void main(String[] args) {
		//Object is used to stor the space in memory to keep all non static data members.
		// by using new operator we can assign the space in the memory.
		Test1 t1=new Test1();
		System.out.println("Please Enter your Name:");
		// Scanner class present in java.util package.
		Scanner sc=new Scanner(System.in);
		//we can not use 'this' keyword in static context 
		//'this' comes into picture when we create the object, and all static methods load once into memory before creating the object.
		
		t1.name=sc.next();
		System.out.println("Your Name is :"+t1.name);
		t1.Method1();
		
		// we can not use super keyword in static context.
		//super.age=4;
		
		
	}

}
