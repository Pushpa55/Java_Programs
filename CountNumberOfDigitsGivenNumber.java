package programs.com;

public class CountNumberOfDigitsGivenNumber {
	
	public static void main(String[] args) {
		
		int n=523;
		
		int count=0;
		
		int sum=0;
		
		while(n>0)
		{
			int r=n%10;
			
			count++;
			
			sum=sum+r;
			
			n=n/10;
		}
		System.out.println("Count number of digits :"+count);
		
		System.out.println("Sum of total digits :"+sum);
		
	}
}
