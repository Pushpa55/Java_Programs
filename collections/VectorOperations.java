package com.sritech.collections;

import java.util.Vector;

public class VectorOperations {
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		
		vc.add("KOTCHERLA");
		vc.add("NAGA");
		vc.add("PUSHPA");
		vc.add("LATHA");
		
		System.out.println(vc);
		//adding element at specific index 
		vc.add(1, "MANI KUMAR");
		System.out.println(vc);
		
		//getting element by index
		System.out.println(vc.get(1));
		
		//getting first element
		System.out.println(vc.firstElement());
		
		//getting last element
		System.out.println(vc.lastElement());
		
		//check vector is empty or not
		System.out.println(vc.isEmpty());
		
		
	}

}
