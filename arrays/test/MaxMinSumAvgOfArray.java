package com.sritech.arrays.test;

public class MaxMinSumAvgOfArray {
	
	public static void main(String[] args) {
		
		int []a={10,18,15,25,14,3,12,78,34};
		int max=a[0];
		int min=a[0];
		int sum=a[0];
		for(int i=1;i<a.length;i++)  // length always starts with 1
		{
			sum=sum+a[i];        //a[1]=18,a[2]=15,a[3]=25,a[4]=3 
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		float avg=(float)sum/a.length;   // average = total no.of elements sum / total no.of elements.
		
		System.out.println("Count of numbers="+a.length);
		
		System.out.println("Max="+max);
		
		System.out.println("Min="+min);
		
		System.out.println("Sum="+sum);
		
		System.out.println("Average="+avg);
		
	}

}
