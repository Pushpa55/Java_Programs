package com.sritech.collections;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Before adding elements :"+list.size());
		list.add("KOTCHERLA");
		list.add("MANI KUMAR");
		list.add("SARASWATHI");
		list.add("NAGA LAKSHMI");
		list.add("LINGA BABU");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		System.out.println("After adding elements :"+list.size());
		
		String remove = list.remove(0);
		System.out.println(remove);
		
		System.out.println("After removing element :"+list.size());
		
		if(list.remove("PUSHPA"))
		{
			System.out.println("PUSHPA is removed");
		}
		else
		{
			System.out.println("PUSHPA is not removed ");
		}
		System.out.println("After removing elements :"+list.size());
		System.out.println(list);
		
		
	}

}
