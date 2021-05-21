package com.jspiders.arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Arraylistint 
{
		
		public static void main(String[] args)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			list.add(1);
			list.add(69);
			list.add(46);
			list.add(900);
			list.add(67);
			list.add(68);
			list.add(911);
			list.add(46);
			list.add(111);
			list.remove(1);
			
			System.out.println("before sorting :" + list);
			list.remove(1);
			
			Collections.sort(list);
			System.out.println("after sorting :"+ list);
			LinkedHashSet<Integer> s = new LinkedHashSet<>(list);
			System.out.println("sort and remove duplicates"+s);
		}
}