package com.jspiders.arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	
	static ArrayList<Student> elist=new ArrayList<Student>();
	public static void createEmpList()
	{
		Student e1=new Student(101,"Nidhi",50);
		Student e2=new Student(106,"Rakul",40);
		Student e3=new Student(103,"Anupama",35);
		Student e4=new Student(104,"Pooja",45);
		Student e5=new Student(105,"Lahari",30);
		Student e6=new Student(101,"Nidhi",50);
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e5);
		elist.add(e4);
		elist.add(e3);
		elist.add(e6);
		
		Collections.sort(elist);
	}
	public static void print()
	{
		elist.forEach(emp->System.out.println(emp));
			
	}
	
	
	public static void main(String[] args) 
	{
		createEmpList();
		print();
	}

}
