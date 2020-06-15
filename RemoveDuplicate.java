package com.utilities;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args){

		ArrayList<Object> al = new ArrayList<Object>();

		al.add("java");
		al.add("C++");
		al.add("Python");
		al.add("C#");
		al.add("java");
		al.add("C++");
		al.add("java");
		


		for(int i=0;i<al.size();i++){

			for(int j=i+1;j<al.size();j++){
				if(al.get(i).equals(al.get(j))){
					al.remove(j);

				}
			}

		}

		System.out.println(al);

	}

}
