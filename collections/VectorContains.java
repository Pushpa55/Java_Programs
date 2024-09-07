package com.sritech.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorContains {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("KOTCHERLA");
		list.add("PUSHPA");
		list.add("NAGA");
		list.add("LATHA");
		
		Vector<String> vc=new Vector<String>();
		
		vc.add("MANI KUMAR");
		vc.add("SARASWATHI");
		vc.add("NAGA LAKSHMI");
		vc.add("LINGA BABU");
		
		System.out.println("Before adding :"+list);
		System.out.println("Before adding :"+vc);
		
		vc.addAll(list);
		
		if(vc.containsAll(list))
		{
			System.out.println("Yes vector contains all elements");
		}
		else
		{
			System.out.println("Don't have");
		}
		vc.remove("PUSHPA");
		
		System.out.println("After removing element");
		
		if(vc.containsAll(list))
		{
			System.out.println("Yes vector contains all elements");
		}
		else
		{
			System.out.println("Don't have");
		}
	}

}
