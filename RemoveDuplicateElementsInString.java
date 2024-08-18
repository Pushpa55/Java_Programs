package programs.com;

public class RemoveDuplicateElementsInString {
	
	public static void main(String[] args) {
		
		String s="pushpa";
		
		char ch='p';
		
		removeChar(s,ch);
	}

	public static void removeChar(String s, char c) {
		
		int n=s.length();
		
		String finalStr= "";
		
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i) !=c)
			{
				finalStr = finalStr+s.charAt(i);
			}
		}
		
		System.out.println(finalStr);
		
	}

}
