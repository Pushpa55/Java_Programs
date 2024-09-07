package com.sritech.arrays.test;

import java.util.Arrays;

public class StringArraySort {
	
	public static void main(String[] args) {
		
		String [] names={"Kotcherla","naga","pushpa","latha","lakshmi","saraswathi","mani","kumar"};
		
		System.out.println("Before Sorting ");
		
		for (int i = 0; i < names.length; i++)
		{
			
			System.out.println(names[i]);
			
		}
		
			Arrays.sort(names);
			
			System.out.println("After Sorting ");
			
			for (int i = 0; i < names.length; i++)
			
			{
				
				System.out.println(names[i]);
				
			}
			

	}

}
