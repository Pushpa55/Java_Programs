package programs.com;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int a[]={11,22,33,44,55,66,77,88,99};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		int l=0;
		
		int h=a.length-1;
		
		boolean flag=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(n==a[m])
			{
				flag=true;
				
				System.out.println("Your number found at ["+m+"]");
				
				break;
			}
			else if(n>a[m])
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
		}	
	
	if(flag !=false)
	{
		System.out.println("Your Number not found");
	}

}
}
