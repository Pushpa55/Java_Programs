package com.sritech.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorToStaticArray {
	
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		
		vc.add("KOTCHERLA");
		vc.add("NAGA");
		vc.add("PUSHPA");
		vc.add("LATHA");
		
		String [] names=new String[vc.size()];
		
		vc.copyInto(names);
		
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
