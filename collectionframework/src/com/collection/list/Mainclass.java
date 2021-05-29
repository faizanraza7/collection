package com.collection.list;

import java.util.ArrayList;

public class Mainclass
{
	
	public static void main(String[] args)
	{
		//new ArrayList(); // step1 
		// arraylist ist is variable in size.
		// search the arraylist class by using shortkey/command ctrl+shift+t.--> this is concrete class.
		//--> to open the source code, we can create the object for the array list
		// because this is a concrete class
		// open the source code of  list interface present in array list class using sort key
		//open the source code of the collection present in java.util package 
		//collection is a interface present in util package
		// open the source code for the Iterable it is prenet in java.lang package. when ever we are talking about util package we are not consider the Iterable.
		// from this we understood that the hirarichy present in frame work is same as java.util packge and lang package in lang package only Iterable
		
		// if the size of the arraylist  is 20 means we are able to insert the 20 element 
		// and we want to store the 21 element in arraylist it will create the new array of size 40
		
		// int[]a = new int[5];--> to store only homogeneous type of elements 
		// Object[] obj = new Object[5];--> by using object we are able to add the heterogeneous type of elements 
		
		ArrayList list = new ArrayList();//step2 --> to add the elements
		list.add(10);//insert operation in order to call non static member creation of object is mandatory
		list.add(10); // in arraylist duplicates are allowd.
		list.add(20.5);
		list.add("sql");
		list.add(null); // in arraylist null values are allowed.
		list.add(null); // multiple null values are allowed.
		// we are trying to store the heterogeneous group of elements 
		// by using get method we are able to retrieve the element 
		
		//Object obj = list.get(0);// UPCASTING
		//Integer i1 = (Integer) obj;// downcasting --> to retrieve the elements.
		//System.out.println(i1);
		
		//Object obj1 = list.get(1);
		//Double d1 = (Double) obj1;
		//System.out.println(d1);
		
		//Object obj2 = list.get(2);
		//String s1 = (String) obj2;
		//System.out.println(s1);			
		// if we try to add the ref variables then toString method is automatically exicuted 
		
		// in this way we have to downcast for every element if the elements are 100 then we have to down cast for 100 times so this is not a right way 
		// so we are going to use for loop 
		
		for(int i=0; i< list.size(); i++)
		{
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		
			
		
	}
}
