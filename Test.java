package com.utilities;
class Deriveded { 
protected final void getDetails() 
{ System.out.println("Deriveded class"); 
} 
} 
public class Test extends Deriveded
{ 
protected final void getDetails() 

{ 
System.out.println("Test class"); 
} 

public static void main(String[] args) 

{ Test obj = new Test(); 
obj.getDetails(); 
}
 } 