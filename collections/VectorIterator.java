package com.sritech.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
	
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		
		vc.add("KOTCHERLA");
		vc.add("NAGA");
		vc.add("PUSHPA");
		vc.add("LATHA");
		
		Iterator<String> iterator=vc.iterator();
		
		while(iterator.hasNext())
		{
			String str=iterator.next();
			System.out.println(str);
		}
		
		
	}

}
