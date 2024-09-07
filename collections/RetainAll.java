package com.sritech.collections;

import java.util.ArrayList;

public class RetainAll {
	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Kocherla");
		list1.add("Mani Kumar");
		list1.add("Saraswathi");
		list1.add("Naga Lakshmi");
		list1.add("Linga Babu");
		list1.add("Pushpa");
		list1.add("Latha");
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("Kotcherla");
		list2.add("NagaMalleswarao");
		list2.add("Lakshmi");
		list2.add("Nagini");
		list2.add("Kamalakar");
		list2.add("Bharmam");
		
		ArrayList<String> list3=new ArrayList<String>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("list1 elements :"+list1);
		System.out.println("list2 elements :"+list2);
		System.out.println("After adding list1 and list2 elements :"+list3);
		
		list3.add("Seshu");
		list3.add("Varam");
		
		System.out.println("After adding elements to list3:"+list3);
		
		list3.retainAll(list2);
		System.out.println("After retain list2 elements in list3 :"+list3);
		
		if(list3.equals(list2))
		{
			System.out.println("list3 and list2 having same elements");
		}
		else
		{
			System.out.println("list3 and list2 don't same elements");
		}
	}	

}
