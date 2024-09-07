package com.sritech.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class GetSubListFromVector {
	
	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		
		vc.add("KOTCHERLA");
		vc.add("NAGA");
		vc.add("PUSHPA");
		vc.add("LATHA");
		
		List<String> subList1=vc.subList(0, 4);
		
		System.out.println("SUB LIST : 0 to 3");
		
		Iterator<String> iterator=subList1.listIterator();
		
		while(iterator.hasNext())
		{
			String str=iterator.next();
			System.out.println(str);
		}
		
		List<String> subList2=vc.subList(1, 2);
		
		System.out.println("SubList : 1 to 2");
		
		Iterator<String> iterator1=subList2.listIterator();
		
		while(iterator1.hasNext())
		{
			String str=iterator1.next();
			System.out.println(str);
		}
		
		
				
		
		
	}

}
