package programs.com;

import java.util.HashSet;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		int a[]={2,1,1,3,4,5,5};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int elements : a)
		{
			h.add(elements);
		}
		System.out.println(h);
	}

}
