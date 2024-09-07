package com.sritech.collections;

import java.util.ArrayList;

public class IsEmptyMethod {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Before no.of elements:"+list.size());
		if(list.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		list.add("KOTCHERLA");
		list.add("MANI KUMAR");
		list.add("SARASWATHI");
		list.add("NAGA LAKSHMI");
		list.add("LINGA BABU");
		list.add("NAGA");
		list.add("PUSHPA");
		list.add("LATHA");
		System.out.println("After no.of elements:"+list.size());
		if(list.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		list.clear();
		System.out.println("After clearing :"+list);
		System.out.println("After clearing list no.of elements:"+list.size());
		if(list.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		
	}

}
