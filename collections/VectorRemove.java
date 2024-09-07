package com.sritech.collections;

import java.util.Vector;

public class VectorRemove {
	
public static void main(String[] args) {
		
		Vector<Integer> vc=new Vector<Integer>();
		
	    vc.add(10);
	    vc.add(20);
	    vc.add(30);
	    vc.add(40);
	    vc.add(50);
	    
	    while( ! vc.isEmpty())
	    {
	    	int i=vc.remove(0);
	    	
	    	 System.out.println(i);
	 	    
	    }
	    if(vc.isEmpty())
	    {
	    	System.out.println("Yes empty");
	    }
	    else
	    {
	    	System.out.println("no ");
	    }
	    
}


}
