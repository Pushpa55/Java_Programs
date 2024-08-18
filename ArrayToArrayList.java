package programs.com;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String s[]={"Naga","Pushpa","Latha","Kotcherla"};
		
		for(String p :s){
			
			System.out.println("String Arrays :"+p);
		}
		
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(s));
		
		System.out.println("ArrayList :"+list);
		
		
		
		
		
	}

}
