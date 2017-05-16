package com.csd.apps;

import java.util.ArrayList;

public class Variable1 {

	//there is two types of variable static and non-static
	// if a variable declared with static called as static variable
	// without static keywords called non static
	public static int age;
	public static String college;
	public String name;
	
	public static void main(String[] args) {
		//we can access static variable under static methods and static blocks without creating object.
		//we can access static variable in static block directly or by using class name.
		Variable1.college="gmit";
		System.out.println(Variable1.college);
		age=25;
		System.out.println(age);
		int arr[]={12,13,14,15,16,1};
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("jai");
		arr2.add("guru");
		arr2.add("mandal");
		// ForEach loop
		for(int i:arr){
			//if i will print i it will give all the numbers 
			System.out.println(i);
			// but if i will print arr it will give the address
			System.out.println(arr);
		}
		for(String name:arr2){
			System.out.println(name);
		}
	}

}
