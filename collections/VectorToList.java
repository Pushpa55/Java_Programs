package com.sritech.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorToList {
	public static void main(String[] args) {
		
		Vector<Integer> vc=new Vector<Integer>();
		
	    vc.add(10);
	    vc.add(20);
	    vc.add(30);
	    vc.add(40);
	    vc.add(50);
	    
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    
	    list.add(60);
	    list.add(70);
	    list.add(80);
	    list.add(90);
	    list.add(100);
	    
	    System.out.println("Before adding :");
	    System.out.println(vc);
	    System.out.println(list);
	    
	    list.addAll(vc);
	    
	    System.out.println("After adding :");
	    System.out.println(vc);
	    System.out.println(list);
	    
	}
}
