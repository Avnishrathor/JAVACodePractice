package com.utilities;
class Overloading{  

	public static void main(String[] args){

		System.out.println(Overloading.add(11,11));  
		System.out.println(Overloading.add(11,11,11));  
		
	}
		public static int add(int a,int b)
		{
			return a+b;
		}  
		public static int add(int a,int b,int c)

		{return a+b+c; 

		}

	}


