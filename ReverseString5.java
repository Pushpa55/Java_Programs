package programs.com;

import java.util.Scanner;

public class ReverseString5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String here");
		
		String s=sc.nextLine();
		
		char ch;
		
		String s1=" ";
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			
			s1=ch+s1;
		}
		
		System.out.println("Normal String :"+s);
		
		System.out.println("Reverse String :"+s1);
	}

}
