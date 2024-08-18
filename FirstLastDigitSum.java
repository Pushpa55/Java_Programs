package programs.com;

public class FirstLastDigitSum {
	
	public static void main(String[] args) {
		
		int n=1234;
		
		int f=0;
		
		int l=n%10;
		
		while(n>=1)
		{
			f=n%10;   // 1234-->4
			
			n=n/10; //   1234/10 -->123
		}
		System.out.println(l+f);
	}

}
