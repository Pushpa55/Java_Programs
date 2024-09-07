package com.sritech.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	
	public static void main(String[] args) {
		
        Vector<String> vc=new Vector<String>();
		
		vc.add("KOTCHERLA");
		vc.add("NAGA");
		vc.add("PUSHPA");
		vc.add("LATHA");
		
		Enumeration<String> enumeration=vc.elements();
		
		while(enumeration.hasMoreElements())
		{
			String str=enumeration.nextElement();
					System.out.println(str);
		}
		
		
		
	}

}
