package com.sritech.collections;

import java.util.Vector;

public class VectorClone {
	
	public static void main(String[] args) {
		
        Vector<String> vector=new Vector<String>();
		
		vector.add("KOTCHERLA");
		vector.add("NAGA");
		vector.add("PUSHPA");
		vector.add("LATHA");
		
		Vector<String> copyVector = ( Vector<String> ) vector.clone();
		
		System.out.println("Actual vector :"+vector);
		
		System.out.println("Cloned vector :"+copyVector);
		
		
		
		
	}

}
