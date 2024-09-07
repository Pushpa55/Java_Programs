package com.sritech.callbyvalue.com;

public class CallByRef {
	private int a;
	private int b;
	public void setData(int x,int y)
	{
		a=x;
		b=y;
	}
	public void display()
	{
		System.out.println("a="+a+"\t b="+b);
	}

}
