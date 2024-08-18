package programs.com;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="catc";
		
		String s2="tacp";
		
		s1=s1.toLowerCase();
		
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Both strings are not an anagram");
		}
		else
		{
			char[] ch1=s1.toCharArray();
			
			char[] ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Both strings are anagram");
			}
			else
			{
				System.out.println("Both string are not an anagram");
			}
		}
	}

}
