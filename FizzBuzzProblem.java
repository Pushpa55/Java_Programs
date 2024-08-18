package programs.com;

/*Print numbers from 1 to n,but for multiples of 3 print "Fizz" instead of the number
and for the multiples of 5 print "Buzz". 
For numbers which are multiples of both 3 and 5,print "FizzBuzz".*/

import java.util.Scanner;

public class FizzBuzzProblem {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number here");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
