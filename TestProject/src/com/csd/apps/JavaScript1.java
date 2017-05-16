package com.csd.apps;

public class JavaScript1 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			if(i%3==0&&i%5==0&&i%7==0){
				System.out.println("357");
			}
			if(i%3==0&&i%5==0){
				System.out.println("35");
			}
			else if(i%3==0){
				
				
				System.out.println("333");
			}
			else if(i%5==0){
				System.out.println("555");
			}
			else if(i%7==0){
				System.out.println("777");
			}
			
			else{
				System.out.println(i);
			}
		}
	}

}
