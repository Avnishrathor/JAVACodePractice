package com.utilities;
class Dog extends Animal

{  
	public static void main(String args[]){  
		Dog d=new Dog();  
	}
	Dog()
	{  
		super();// even we remove this line -compiler automatically  adds super() as the first statement 

		System.out.println("dog is created");  
	}  
}  
