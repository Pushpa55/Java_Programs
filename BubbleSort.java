package programs.com;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[]={22,77,33,88,44,99,11,66,22,55};
		
		System.out.println("Before Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sort");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
