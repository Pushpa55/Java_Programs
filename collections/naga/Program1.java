package com.sritech.collections.naga;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("javaScript");
		list.add("oracle");
		System.out.println(list);
		ArrayList<String> b  = (ArrayList<String>) list.clone();
		b.add("html");
		System.out.println("after clone"+b);
		System.out.println("before clone"+list);
		
		if(b == list)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	
		System.out.println(b.hashCode());
		System.out.println(list.hashCode());
		
		
		
	}

}
