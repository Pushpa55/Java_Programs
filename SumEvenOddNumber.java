package programs.com;

public class SumEvenOddNumber {
	
	public static void main(String[] args) {
		
		int n=10;
		
		int i=0;
		
		int evenSum=0;
		
		int oddSum=0;
		
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println("Even Number="+i);
				
				evenSum=evenSum+i;
			}
			else if(i%2==1)
			{
				System.out.println("Odd Number="+i);
				
				oddSum=oddSum+i;
			}
			i++;
		}
		System.out.println("Even Sum="+evenSum);
		
		System.out.println("Odd Sum="+oddSum);
	}

}
