package programs.com;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your sentence");
		
		String s=sc.nextLine();
		
	    String arr[]=s.split(" ");
	    
	    String rev="";
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=arr[i].length()-1;j>=0;j--)
	    	{
	    		rev+=arr[i].charAt(j);
	    	}
	    	rev+=" ";
	    }
	    System.out.println("Before :"+s);
	    
	    System.out.println("After :"+rev.trim());
	}

}
