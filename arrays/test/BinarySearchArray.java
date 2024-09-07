package com.sritech.arrays.test;

import java.util.Scanner;

public class BinarySearchArray {
	public static void main(String[] args) {
		int []a={5,11,13,15,20,21,24,27,29,30,31,32,37,39,40,41,42,46,48,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your finding number");
		int num=sc.nextInt();
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(num==a[m])
			{
				flag=true;
				System.out.println("Your number is found at["+m+"]");
				break;
			}
			else if(num>a[m])
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Your number is not found");
		}
	}

}
