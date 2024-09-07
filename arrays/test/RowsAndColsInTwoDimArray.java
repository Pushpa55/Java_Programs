package com.sritech.arrays.test;

public class RowsAndColsInTwoDimArray {
	public static void main(String[] args) {

		int [][] a = { {10,20,30}, {16,23,41,32,}, {9,10,23},{5,34},{12,13,14,15} };
	
		
		System.out.println("No of rows = "+a.length);
		
		System.out.println("No of cols in 1st row = "+a[0].length);
		
		System.out.println("No of cols in 2nd row = "+a[1].length);
	
		System.out.println("No of cols in 3rd row = "+a[2].length);
		
		System.out.println("No of cols in 4th row = "+a[3].length);
		
		System.out.println("No of cols in 5th row = "+a[4].length);
		
	}

}
