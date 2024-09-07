package com.sritech.collections;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerCollectionsClass {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(20);
		list.add(40);
		
		System.out.println("Before sorting :"+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting :"+list);
	}

}
