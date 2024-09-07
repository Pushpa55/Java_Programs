package com.sritech.arrays.test;

public class CompileTimeInitializationArray {
	
	public static void main(String[] args) {
		
		int [][] a = {{1,2,3},{4,5,6},{7,8,9},{11,12,11}};
	     
		for(int i = 0; i<a.length; i++)   // row length
		   {
			 System.out.println();
			                    
			for(int j = 0; j<a[i].length; j++) // column length
			{
				System.out.print(a[i][j] +"  ");
			}
		 }

	}

}
