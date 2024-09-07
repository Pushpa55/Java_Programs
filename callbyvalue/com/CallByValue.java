package com.sritech.callbyvalue.com;

public class CallByValue {
	public static void main(String[] args) {
		System.out.println("Main Method");
		int a=10;
		int b=20;
		display(a,b);
		System.out.println("Main End");
	}
	public static void display(int x,int y)
	{
		System.out.println("x="+x+"\t y="+y);
	}

}
