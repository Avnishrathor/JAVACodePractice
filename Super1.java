package com.utilities;

public class Super1 extends SuperKey{

	public static void main(String args[]){  
		Super1 d=new Super1();  
		d.printColor();  
		d.work();
	}

	String color="black";  
	void printColor(){  
		System.out.println("prints color Super1=="+color);//prints color Super1 
		System.out.println("prints color of SuperKey ==="+super.color);//prints color of SuperKey 
	}  

	void eat(){System.out.println("eating bread in child...");}  
	void bark(){System.out.println("barking in child class...");}  
	void work()
	{ 
		bark(); 
		super.eat();  
		eat();




	}
}