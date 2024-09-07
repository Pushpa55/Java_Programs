package com.sritech.callbyvalue.com;


public class CallByRefTest {
	public static void main(String[] args) {
		CallByRef s1=new CallByRef();
		s1.setData(10,20);
		CallByRef s2=s1;   // it is a reference assignment
		System.out.println("Initial Values");
		s1.display();
		s2.display();
		s2.setData(30, 40);
		System.out.println("After Changing from s2 object");
		s1.display();
		s2.display();
	}

}
