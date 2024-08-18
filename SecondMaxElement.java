package programs.com;

public class SecondMaxElement {
	
	public static void main(String[] args) {
		
		int a[]={2,9,3,1,5,8,4,6,7};
		
		int max = 0;
		
		int secondMax = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				secondMax=max; 
				
				max=a[i];
			}
			else if(a[i]>secondMax && a[i] !=max )
			{
				secondMax=a[i];
			} 
		}
		
		System.out.println("Maximum :"+max);
		
		System.out.println("SecondMax :"+secondMax);
		
	}

}
