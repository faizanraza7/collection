package com.jspiders.hashset.sort;

import java.util.HashSet;

public class HashsetInt 
{
	public static void main(String[] args)
	{
		HashSet<Integer> list = new HashSet<Integer>();
		
		list.add(1);
		list.add(69);
		list.add(46);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(900);
		list.add(67);
		list.add(68);
		list.add(911);
		list.add(46);
		list.add(111);
	 
		list.remove(69);
		
		System.out.println(list);
		
		
	}

}
