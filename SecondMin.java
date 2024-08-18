package programs.com;

public class SecondMin {
	
	public static void main(String[] args) {
		
		int a[]={2,9,1,7,4,8,3,5,6};
		
		int min=a[0];
		
		int secondMin=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secondMin=min;
				
				min=a[i];
			}
			else if(a[i]<secondMin && min !=a[i] )
			{
				secondMin=a[i];
			}
		}
		
		System.out.println("Minimum :"+min);
		
		System.out.println("SecondMin :"+secondMin);
	}

}
