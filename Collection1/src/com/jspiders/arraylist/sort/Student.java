package com.jspiders.arraylist.sort;

public class Student implements Comparable<Student> {

	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Student o) {
		
		return -this.id + o.id;
	}
	
	
	
/*	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	@Override
	public int compareTo(Student o) 
	{
		if(this.hashCode()>o.hashCode())
			return 1; 
		else if(this.hashCode()<o.hashCode())
			return -1;
		else
			return 0;
	}*/
	
}

	
	
	

