package com.collection.list;

public class Student 
{
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) // generate parameterized constructor.
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		
		//public void display()
		// whenever you want to display all details insted of  user define method 
		// directly we can generate tostring method 
		//{
			//System.out.println(id);
			//System.out.println(name);
			//System.out.println(marks);
		
	}

	//@Override
	//public String toString() {
		//return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	//}
	
	
}
