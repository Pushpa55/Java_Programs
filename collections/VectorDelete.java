package com.sritech.collections;

import java.util.Vector;

public class VectorDelete {
public static void main(String[] args) {
		
		Vector<Integer> vc=new Vector<Integer>();
		
	    vc.add(10);
	    vc.add(20);
	    vc.add(30);
	    vc.add(40);
	    vc.add(50);
	    
	    System.out.println("Before deleting vector elements :");
	    
	    if(vc.isEmpty())
	    {
	    	System.out.println("Yes empty");
	    }
	    else
	    {
	    	System.out.println("No empty");
	    }
	    
	    vc.clear();
	    
	    System.out.println("After deleting vector elements:");
	    
	    if(vc.isEmpty())
	    {
	    	System.out.println("Yes empty");
	    }
	    else
	    {
	    	System.out.println("No empty");
	    }


}

}
