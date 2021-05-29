package com.collection.list;

import java.util.ArrayList;

public class Mainclass1 {

	public static void main(String[] args) 
	{	
		Student s1 = new Student(101,"king",90.1);
		Student s2 = new Student(102,"queen",40.2);
		Student s3 = new Student(103,"blake",55.6);
		ArrayList list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i = 0; i<list.size();i++)
		{
			Object obj = list.get(i);
			System.out.println(obj);
			
		}
	}

}
