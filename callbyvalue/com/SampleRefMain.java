package com.sritech.callbyvalue.com;

public class SampleRefMain {
	public static void main(String[] args) {
		SampleRef s1=new SampleRef();
		s1.setData(10, 30);
		System.out.println("Before call to upadateData method");
		s1.display();
		
		updateData(s1);
		
		System.out.println("After call to updateData method");
		s1.display();
	}
	public static void updateData(SampleRef x)
	{
		x.setData(50, 80);
	}

}
