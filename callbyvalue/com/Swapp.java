package com.sritech.callbyvalue.com;

public class Swapp {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Main method");
		System.out.println("a="+a+"\t b="+b);
		swapp(a,b);
		System.out.println("Main end");
		System.out.println("a="+a+"\t b="+b);
	}
	public static void swapp(int x,int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		//System.out.println(x+"\t"+y);
	}

}
