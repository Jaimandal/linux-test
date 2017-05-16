package com.csd.apps;

public class Array1 {

	//Array is a collection of element of same data type.
	//Array is having fixed length it can't increase during runtime.
	//so to overcome collection came into picture.
	
	public static void main(String[] args) {
		for(int i=1;i<=40;i++){
			if(i%3==0){
				if(i%5==0){
					if(i%7==0){
						System.out.println("3'5'7");
					}else{
						System.out.println("3'5");
					}
				}else{
					System.out.println("333");
				}
			}
			else if(i%5==0){
				System.out.println("555");
			}
			else if(i%7==0){
				System.out.println("777");
			}else{
				System.out.println(i);
			}
		}
	}

}
