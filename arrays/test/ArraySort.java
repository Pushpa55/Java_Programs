package com.sritech.arrays.test;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args){
				
			int [] a={10,8,17,6,100,50,23,65,36,29};
			
			System.out.println("Before Sorting ");
			
			for (int i = 0; i < a.length; i++)
			{
				
				System.out.println(a[i]);
				
			}
			
				Arrays.sort(a);
				
				System.out.println("After Sorting ");
				
				for (int i = 0; i < a.length; i++)
				{
					
					System.out.println(a[i]);
	            }
		}
}
