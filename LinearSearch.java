package programs.com;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int a[]={33,11,77,44,99,55,22,66,88};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=true;
				
				System.out.println("Your number found at ["+i+"]");
				
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Your number is not found");
		}
	}

}
