package programs.com;

import java.util.*;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("NAGA");
		
		list.add("Pushpa");
		
		list.add("Latha");
		
		System.out.println(list);
		
		String []s=list.toArray(new String[list.size()]);
		
		for(String word : s)
		{
			System.out.println(word);
		}
		
	}

}
