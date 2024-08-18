package programs.com;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		int n=1221;
		
		int sum=0;
		
		int temp=n;
		
		while(n>0)
		{
			int r=n%10;
			
			sum=sum*10+r;
			
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a Palindrom");
		}
	}

}
