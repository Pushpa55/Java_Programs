package programs.com;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInStringCount {
	
	public static void main(String[] args) {
		
		String s="nagapushpalatha";
		
	    Set<Character> charSet=new HashSet<Character>();
	    
	    Set<Character> duplicates=new HashSet<Character>();
	    
	    int count=0;
	    
	    for(char c : s.toCharArray())
	    {
	    	if(!charSet.add(c))
	    	{
	    		duplicates.add(c);
	    		
	    		count++;
	    	}
	    }
	    System.out.println("Duplicate Characters are :"+duplicates);
	    
	    
	    
		
	}

}
