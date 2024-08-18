package programs.com;

import java.util.Scanner;

public class OctalNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		boolean flag=true;
		
		while(n>0)
		{
			int r=n%10;
			
			if(r>7)
			{
				flag=false;
				
				System.out.println("It is not an octal number");
				
				break;
			}
			n=n/10;
		}
		if(flag==true)
		{
			System.out.println("It is an octal");
		}
	}

}
