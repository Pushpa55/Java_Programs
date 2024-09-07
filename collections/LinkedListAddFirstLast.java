package com.sritech.collections;

import java.util.LinkedList;

public class LinkedListAddFirstLast {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("KOTCHERLA");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		
		System.out.println(list);
		
		list.addFirst("MANI KUMAR");
		list.addLast("SARASWATHI");
		
		System.out.println(list);
		
		String first=list.getFirst();
		String last=list.getLast();
		
		System.out.println(first);
		System.out.println(last);
		
		String first1=list.removeFirst();
		String last1=list.removeLast();
		
		System.out.println(first1);
		System.out.println(last1);
		
		System.out.println("After removing :"+list);
	}

}
