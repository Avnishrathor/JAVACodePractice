package com.utilities;

public class Number {
	
	
	public static void main(String args[])
	{
		String str="";
	String num ="9138278422";  ///(913)82-78-422
	String a= num.substring(0, 3);
	String b=num.substring(3, 5);
	String d=num.substring(5, 7);
	String e=num.substring(7, 10);
	char c='(';
	char c1=')';
	char d1='-';
	d=d1+d;
	d=d+d1;
	a=c+a;
	a=a+c1;
	str+=a+b+d+e;
	System.out.println(str);
	}

}
