package programs.com;

public class PalindromString {
	
	public static void main(String[] args) {
	
	String s="PUSHPA";
	
	StringBuffer sb=new StringBuffer(s);
	
	sb.reverse();
	
	String result = sb.toString();
	
	System.out.println(sb);
	
	if(result.equals(s))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
	
	}

}
