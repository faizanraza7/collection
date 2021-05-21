package com.jspiders.arraylist.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArraylistString 
{
		public static void main(String[]args)
		{
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("abc");
			list.add("java");
			list.add("sql");
			list.add("advance");
			list.add("hibernate");
			list.add("javascript");
			list.add("advance");

			System.out.println("before string :" + list);
			Collections.sort(list);
			
			System.out.println("after sorting :"+ list);
			LinkedHashSet<String> s = new LinkedHashSet<>(list);
			System.out.println("sort and remove duplicates"+s);
		}
}
