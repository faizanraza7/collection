package com.jspiders.hashset.sort;

import java.util.HashSet;

public class HashSetSort {

		static HashSet<Student1> slist=new HashSet<Student1>();
		public static void createStdList()
		{
             Student1 e1=new Student1(101,"java",50);
             Student1 e2=new Student1(101,"sql",40);
             Student1 e3=new Student1(101,"sql",40);
             Student1 e4=new Student1(103,"hibernate",35);
             Student1 e5=new Student1(105,"javascript",30);
             Student1 e6=new Student1(104,"advance",45);
			
			slist.add(e1);
			slist.add(e2);
			slist.add(e5);
			slist.add(e4);
			slist.add(e3);
			slist.add(e6);
	}
		
	public static void print()
	{
			
			slist.forEach(std->System.out.println(std));
		}
		
		public static void main(String[] args) 
		{
			createStdList();
			print();
		}
	}




