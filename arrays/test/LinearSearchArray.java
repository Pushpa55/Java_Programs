package com.sritech.arrays.test;

import java.util.Scanner;

public class LinearSearchArray {
	public static void main(String[] args) {
		int[]a={10,14,8,36,76,12,45,98,64,32,6,19,7,25,98,24};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number you want to search");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=true;
				System.out.println("Your Number Found at["+i+"]");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Your number is not found");
		}
	}

}
