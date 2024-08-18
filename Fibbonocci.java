package programs.com;

public class Fibbonocci {
	
	public static void main(String[] args) {
		
		int f=0;
		
		int s=1;
		
		int n=30;
		
		int sum=0;
		
		while(f<=n)
		{
			System.out.print(f+" ");
			
		    sum= f+s;
		
		    f=s;
		
		    s=sum;
		}
		
		
		
		
	}

}
