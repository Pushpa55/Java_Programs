package programs.com;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		int i=0;;
		
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}

}
