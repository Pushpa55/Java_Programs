package com.sritech.collections;

import java.util.Stack;

public class PushPopPeek {
	
	public static void main(String[] args) {
		
		Stack<String> bookRack=new Stack<String>();
		
		bookRack.push("JAVA");
		bookRack.push("PYTHON");
		bookRack.push("LINUX");
		bookRack.push("HTML");
		bookRack.push("UNIX");
		bookRack.push("JAVA SCRIPT");
		
		System.out.println(bookRack);
		
		String pop = bookRack.pop();
		
		System.out.println(pop);
		
		String peek = bookRack.peek();
		System.out.println(peek);
		
	}

}
